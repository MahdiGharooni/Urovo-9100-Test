package ir.co.pna.test_urovoi9100;

// @formatter:off

import android.database.Cursor;

import androidx.annotation.Nullable;

/**
 * Cursor wrapper for the {@code status} table.
 */
@SuppressWarnings({"WeakerAccess", "unused", "UnnecessaryLocalVariable"})
public class StatusCursor extends AbstractCursor implements StatusModel {
    public StatusCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    @Override
    public long getId() {
        Long res = getLongOrNull(StatusColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code status_id} value.
     * Can be {@code null}.
     */
    @Nullable
    @Override
    public String getStatusId() {
        String res = getStringOrNull(StatusColumns.STATUS_ID);
        return res;
    }

    /**
     * Get the {@code reversal} value.
     * Can be {@code null}.
     */
    @Nullable
    @Override
    public String getReversal() {
        String res = getStringOrNull(StatusColumns.REVERSAL);
        return res;
    }

    /**
     * Get the {@code reversal_print} value.
     * Can be {@code null}.
     */
    @Nullable
    @Override
    public String getReversalPrint() {
        String res = getStringOrNull(StatusColumns.REVERSAL_PRINT);
        return res;
    }

    /**
     * Get the {@code advice} value.
     * Can be {@code null}.
     */
    @Nullable
    @Override
    public String getAdvice() {
        String res = getStringOrNull(StatusColumns.ADVICE);
        return res;
    }

    /**
     * Get the {@code transaction_print} value.
     * Can be {@code null}.
     */
    @Nullable
    @Override
    public String getTransactionPrint() {
        String res = getStringOrNull(StatusColumns.TRANSACTION_PRINT);
        return res;
    }

    /**
     * Get the {@code reversal sokht} value.
     * Can be {@code null}.
     */
    @Nullable
    @Override
    public String getReversalSokht() {
        String res = getStringOrNull(StatusColumns.REVERSAL_SOKHT);
        return res;
    }

    /**
     * Get the {@code reversal_print} value.
     * Can be {@code null}.
     */
    @Nullable
    @Override
    public String getReversalPrintSokht() {
        String res = getStringOrNull(StatusColumns.REVERSAL_PRINT_SOKHT);
        return res;
    }

    /**
     * Get the {@code advice} value.
     * Can be {@code null}.
     */
    @Nullable
    @Override
    public String getAdviceSokht() {
        String res = getStringOrNull(StatusColumns.ADVICE_SOKHT);
        return res;
    }

    /**
     * Get the {@code transaction_print} value.
     * Can be {@code null}.
     */
    @Nullable
    @Override
    public String getTransactionPrintSokht() {
        String res = getStringOrNull(StatusColumns.TRANSACTION_PRINT_SOKHT);
        return res;
    }


    /**
     * Get the {@code extra1} value.
     * Can be {@code null}.
     */
    @Nullable
    @Override
    public String getExtra1() {
        String res = getStringOrNull(StatusColumns.EXTRA1);
        return res;
    }

    /**
     * Get the {@code extra2} value.
     * Can be {@code null}.
     */
    @Nullable
    @Override
    public String getExtra2() {
        String res = getStringOrNull(StatusColumns.EXTRA2);
        return res;
    }

    /**
     * Get the {@code extra3} value.
     * Can be {@code null}.
     */
    @Nullable
    @Override
    public String getExtra3() {
        String res = getStringOrNull(StatusColumns.EXTRA3);
        return res;
    }
}
