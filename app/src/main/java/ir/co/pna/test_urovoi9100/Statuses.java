package ir.co.pna.test_urovoi9100;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
public class Statuses {

    public static int insert(Context context, String statusId, String reversal, String reversalPrint, String advice, String transactionPrint, String reversalSokht, String reversalPrintSokht, String adviceSokht, String transactionPrintSokht,String printShaparak) {
        StatusContentValues contentValues = new StatusContentValues();
        contentValues.putStatusId(statusId).putReversal(reversal).putReversalPrint(reversalPrint)
        .putAdvice(advice).putTransactionPrint(transactionPrint).putReversalSokht(reversalSokht)
        .putReversalPrintSokht(reversalPrintSokht).putAdviceSokht(adviceSokht).putTransactionPrintSokht(transactionPrintSokht).putExtra1(printShaparak);
        Uri uri = contentValues.insert(context);
        return Integer.parseInt(uri.getLastPathSegment());
    }
}
