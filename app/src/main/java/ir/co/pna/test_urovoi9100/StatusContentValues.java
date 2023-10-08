package ir.co.pna.test_urovoi9100;

// @formatter:off

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

import androidx.annotation.Nullable;

/**
 * Content values wrapper for the {@code status} table.
 */
@SuppressWarnings({"ConstantConditions", "unused"})
public class StatusContentValues extends AbstractContentValues {


    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable StatusSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param context The context to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable StatusSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public StatusContentValues putStatusId(@Nullable String value) {
        mContentValues.put(StatusColumns.STATUS_ID, value);
        return this;
    }

    public StatusContentValues putStatusIdNull() {
        mContentValues.putNull(StatusColumns.STATUS_ID);
        return this;
    }

    public StatusContentValues putReversal(@Nullable String value) {
        mContentValues.put(StatusColumns.REVERSAL, value);
        return this;
    }

    public StatusContentValues putReversalNull() {
        mContentValues.putNull(StatusColumns.REVERSAL);
        return this;
    }

    public StatusContentValues putReversalPrint(@Nullable String value) {
        mContentValues.put(StatusColumns.REVERSAL_PRINT, value);
        return this;
    }

    public StatusContentValues putReversalPrintNull() {
        mContentValues.putNull(StatusColumns.REVERSAL_PRINT);
        return this;
    }

    public StatusContentValues putAdvice(@Nullable String value) {
        mContentValues.put(StatusColumns.ADVICE, value);
        return this;
    }

    public StatusContentValues putAdviceNull() {
        mContentValues.putNull(StatusColumns.ADVICE);
        return this;
    }

    public StatusContentValues putTransactionPrint(@Nullable String value) {
        mContentValues.put(StatusColumns.TRANSACTION_PRINT, value);
        return this;
    }

    public StatusContentValues putTransactionPrintNull() {
        mContentValues.putNull(StatusColumns.TRANSACTION_PRINT);
        return this;
    }

    public StatusContentValues putReversalSokht(@Nullable String value) {
        mContentValues.put(StatusColumns.REVERSAL_SOKHT, value);
        return this;
    }

    public StatusContentValues putReversalSokhtNull() {
        mContentValues.putNull(StatusColumns.REVERSAL_SOKHT);
        return this;
    }

    public StatusContentValues putReversalPrintSokht(@Nullable String value) {
        mContentValues.put(StatusColumns.REVERSAL_PRINT_SOKHT, value);
        return this;
    }

    public StatusContentValues putReversalPrintSokhtNull() {
        mContentValues.putNull(StatusColumns.REVERSAL_PRINT_SOKHT);
        return this;
    }

    public StatusContentValues putAdviceSokht(@Nullable String value) {
        mContentValues.put(StatusColumns.ADVICE_SOKHT, value);
        return this;
    }

    public StatusContentValues putAdviceSokhtNull() {
        mContentValues.putNull(StatusColumns.ADVICE_SOKHT);
        return this;
    }

    public StatusContentValues putTransactionPrintSokht(@Nullable String value) {
        mContentValues.put(StatusColumns.TRANSACTION_PRINT_SOKHT, value);
        return this;
    }

    public StatusContentValues putTransactionPrintSokhtNull() {
        mContentValues.putNull(StatusColumns.TRANSACTION_PRINT_SOKHT);
        return this;
    }

    public StatusContentValues putExtra1(@Nullable String value) {
        mContentValues.put(StatusColumns.EXTRA1, value);
        return this;
    }

    public StatusContentValues putExtra1Null() {
        mContentValues.putNull(StatusColumns.EXTRA1);
        return this;
    }

    public StatusContentValues putExtra2(@Nullable String value) {
        mContentValues.put(StatusColumns.EXTRA2, value);
        return this;
    }

    public StatusContentValues putExtra2Null() {
        mContentValues.putNull(StatusColumns.EXTRA2);
        return this;
    }

    public StatusContentValues putExtra3(@Nullable String value) {
        mContentValues.put(StatusColumns.EXTRA3, value);
        return this;
    }

    public StatusContentValues putExtra3Null() {
        mContentValues.putNull(StatusColumns.EXTRA3);
        return this;
    }

    @Override
    public Uri uri() {
        return StatusColumns.CONTENT_URI;
    }
}
