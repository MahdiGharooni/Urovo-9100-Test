package ir.co.pna.test_urovoi9100;

// @formatter:off

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Columns for the {@code status} table.
 */
@SuppressWarnings("unused")
public class StatusColumns implements BaseColumns {
    public static final String TABLE_NAME = "status";
    public static final Uri CONTENT_URI = Uri.parse(PnContentProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    public static final String STATUS_ID = "status_id";

    public static final String REVERSAL = "reversal";

    public static final String REVERSAL_PRINT = "reversal_print";

    public static final String ADVICE = "advice";

    public static final String TRANSACTION_PRINT = "transaction_print";

    public static final String REVERSAL_SOKHT = "reversal_sokht";

    public static final String REVERSAL_PRINT_SOKHT = "reversal_print_sokht";

    public static final String ADVICE_SOKHT = "advice_sokht";

    public static final String TRANSACTION_PRINT_SOKHT = "transaction_print_sokht";

    public static final String EXTRA1 = "extra1";

    public static final String EXTRA2 = "extra2";

    public static final String EXTRA3 = "extra3";


    public static final String DEFAULT_ORDER = null;

    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            STATUS_ID,
            REVERSAL,
            REVERSAL_PRINT,
            ADVICE,
            TRANSACTION_PRINT,
            REVERSAL_SOKHT,
            REVERSAL_PRINT_SOKHT,
            ADVICE_SOKHT,
            TRANSACTION_PRINT_SOKHT,
            EXTRA1,
            EXTRA2,
            EXTRA3
    };

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(STATUS_ID) || c.contains("." + STATUS_ID)) return true;
            if (c.equals(REVERSAL) || c.contains("." + REVERSAL)) return true;
            if (c.equals(REVERSAL_PRINT) || c.contains("." + REVERSAL_PRINT)) return true;
            if (c.equals(ADVICE) || c.contains("." + ADVICE)) return true;
            if (c.equals(TRANSACTION_PRINT) || c.contains("." + TRANSACTION_PRINT)) return true;
            if (c.equals(REVERSAL_SOKHT) || c.contains("." + REVERSAL_SOKHT)) return true;
            if (c.equals(REVERSAL_PRINT_SOKHT) || c.contains("." + REVERSAL_PRINT_SOKHT)) return true;
            if (c.equals(ADVICE_SOKHT) || c.contains("." + ADVICE_SOKHT)) return true;
            if (c.equals(TRANSACTION_PRINT_SOKHT) || c.contains("." + TRANSACTION_PRINT_SOKHT)) return true;
            if (c.equals(EXTRA1) || c.contains("." + EXTRA1)) return true;
            if (c.equals(EXTRA2) || c.contains("." + EXTRA2)) return true;
            if (c.equals(EXTRA3) || c.contains("." + EXTRA3)) return true;
        }
        return false;
    }

}
