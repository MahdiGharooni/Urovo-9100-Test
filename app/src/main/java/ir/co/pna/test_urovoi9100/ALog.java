package ir.co.pna.test_urovoi9100;

import android.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class ALog {

    public static boolean mIsDebugMode = BuildConfig.DEBUG;
    public static boolean mIsLogEnabel = true;
    public static final String TAG = "A-Pna";

    public static void d(Object o,String log){
        if(mIsDebugMode && mIsLogEnabel){
            Log.d(TAG, "< "+o.getClass().getName()+" > " +log);
        }
    }}
