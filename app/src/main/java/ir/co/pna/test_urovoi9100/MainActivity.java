package ir.co.pna.test_urovoi9100;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Statuses.insert(getApplicationContext(), AppConstant.DB_STATUS_ROW_ID, "0", "0", "0", "0", "0", "0", "0", "0", "1");
    }
}