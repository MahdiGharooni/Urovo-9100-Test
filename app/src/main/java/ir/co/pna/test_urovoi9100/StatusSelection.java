package ir.co.pna.test_urovoi9100;

// @formatter:off

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

import androidx.loader.content.CursorLoader;

/**
 * Selection for the {@code status} table.
 */
@SuppressWarnings({"unused", "WeakerAccess", "Recycle"})
public class StatusSelection extends AbstractSelection<StatusSelection> {
    @Override
    protected Uri baseUri() {
        return StatusColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code StatusCursor} object, which is positioned before the first entry, or null.
     */
    public StatusCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new StatusCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public StatusCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code StatusCursor} object, which is positioned before the first entry, or null.
     */
    public StatusCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new StatusCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public StatusCursor query(Context context) {
        return query(context, null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public CursorLoader getCursorLoader(Context context, String[] projection) {
        return new CursorLoader(context, uri(), projection, sel(), args(), order()) {
            @Override
            public Cursor loadInBackground() {
                return new StatusCursor(super.loadInBackground());
            }
        };
    }


    public StatusSelection id(long... value) {
        addEquals("status." + StatusColumns._ID, toObjectArray(value));
        return this;
    }

    public StatusSelection idNot(long... value) {
        addNotEquals("status." + StatusColumns._ID, toObjectArray(value));
        return this;
    }

    public StatusSelection orderById(boolean desc) {
        orderBy("status." + StatusColumns._ID, desc);
        return this;
    }

    public StatusSelection orderById() {
        return orderById(false);
    }

    public StatusSelection statusId(String... value) {
        addEquals(StatusColumns.STATUS_ID, value);
        return this;
    }

    public StatusSelection statusIdNot(String... value) {
        addNotEquals(StatusColumns.STATUS_ID, value);
        return this;
    }

    public StatusSelection statusIdLike(String... value) {
        addLike(StatusColumns.STATUS_ID, value);
        return this;
    }

    public StatusSelection statusIdContains(String... value) {
        addContains(StatusColumns.STATUS_ID, value);
        return this;
    }

    public StatusSelection statusIdStartsWith(String... value) {
        addStartsWith(StatusColumns.STATUS_ID, value);
        return this;
    }

    public StatusSelection statusIdEndsWith(String... value) {
        addEndsWith(StatusColumns.STATUS_ID, value);
        return this;
    }

    public StatusSelection orderByStatusId(boolean desc) {
        orderBy(StatusColumns.STATUS_ID, desc);
        return this;
    }

    public StatusSelection orderByStatusId() {
        orderBy(StatusColumns.STATUS_ID, false);
        return this;
    }

    public StatusSelection reversal(String... value) {
        addEquals(StatusColumns.REVERSAL, value);
        return this;
    }

    public StatusSelection reversalNot(String... value) {
        addNotEquals(StatusColumns.REVERSAL, value);
        return this;
    }

    public StatusSelection reversalLike(String... value) {
        addLike(StatusColumns.REVERSAL, value);
        return this;
    }

    public StatusSelection reversalContains(String... value) {
        addContains(StatusColumns.REVERSAL, value);
        return this;
    }

    public StatusSelection reversalStartsWith(String... value) {
        addStartsWith(StatusColumns.REVERSAL, value);
        return this;
    }

    public StatusSelection reversalEndsWith(String... value) {
        addEndsWith(StatusColumns.REVERSAL, value);
        return this;
    }

    public StatusSelection orderByReversal(boolean desc) {
        orderBy(StatusColumns.REVERSAL, desc);
        return this;
    }

    public StatusSelection orderByReversal() {
        orderBy(StatusColumns.REVERSAL, false);
        return this;
    }

    public StatusSelection reversalPrint(String... value) {
        addEquals(StatusColumns.REVERSAL_PRINT, value);
        return this;
    }

    public StatusSelection reversalPrintNot(String... value) {
        addNotEquals(StatusColumns.REVERSAL_PRINT, value);
        return this;
    }

    public StatusSelection reversalPrintLike(String... value) {
        addLike(StatusColumns.REVERSAL_PRINT, value);
        return this;
    }

    public StatusSelection reversalPrintContains(String... value) {
        addContains(StatusColumns.REVERSAL_PRINT, value);
        return this;
    }

    public StatusSelection reversalPrintStartsWith(String... value) {
        addStartsWith(StatusColumns.REVERSAL_PRINT, value);
        return this;
    }

    public StatusSelection reversalPrintEndsWith(String... value) {
        addEndsWith(StatusColumns.REVERSAL_PRINT, value);
        return this;
    }

    public StatusSelection orderByReversalPrint(boolean desc) {
        orderBy(StatusColumns.REVERSAL_PRINT, desc);
        return this;
    }

    public StatusSelection orderByReversalPrint() {
        orderBy(StatusColumns.REVERSAL_PRINT, false);
        return this;
    }

    public StatusSelection advice(String... value) {
        addEquals(StatusColumns.ADVICE, value);
        return this;
    }

    public StatusSelection adviceNot(String... value) {
        addNotEquals(StatusColumns.ADVICE, value);
        return this;
    }

    public StatusSelection adviceLike(String... value) {
        addLike(StatusColumns.ADVICE, value);
        return this;
    }

    public StatusSelection adviceContains(String... value) {
        addContains(StatusColumns.ADVICE, value);
        return this;
    }

    public StatusSelection adviceStartsWith(String... value) {
        addStartsWith(StatusColumns.ADVICE, value);
        return this;
    }

    public StatusSelection adviceEndsWith(String... value) {
        addEndsWith(StatusColumns.ADVICE, value);
        return this;
    }

    public StatusSelection orderByAdvice(boolean desc) {
        orderBy(StatusColumns.ADVICE, desc);
        return this;
    }

    public StatusSelection orderByAdvice() {
        orderBy(StatusColumns.ADVICE, false);
        return this;
    }

    public StatusSelection transactionPrint(String... value) {
        addEquals(StatusColumns.TRANSACTION_PRINT, value);
        return this;
    }

    public StatusSelection transactionPrintNot(String... value) {
        addNotEquals(StatusColumns.TRANSACTION_PRINT, value);
        return this;
    }

    public StatusSelection transactionPrintLike(String... value) {
        addLike(StatusColumns.TRANSACTION_PRINT, value);
        return this;
    }

    public StatusSelection transactionPrintContains(String... value) {
        addContains(StatusColumns.TRANSACTION_PRINT, value);
        return this;
    }

    public StatusSelection transactionPrintStartsWith(String... value) {
        addStartsWith(StatusColumns.TRANSACTION_PRINT, value);
        return this;
    }

    public StatusSelection transactionPrintEndsWith(String... value) {
        addEndsWith(StatusColumns.TRANSACTION_PRINT, value);
        return this;
    }

    public StatusSelection orderByTransactionPrint(boolean desc) {
        orderBy(StatusColumns.TRANSACTION_PRINT, desc);
        return this;
    }

    public StatusSelection orderByTransactionPrint() {
        orderBy(StatusColumns.TRANSACTION_PRINT, false);
        return this;
    }

    /////////////////////////////////////////////////////////

    public StatusSelection reversalSokht(String... value) {
        addEquals(StatusColumns.REVERSAL_SOKHT, value);
        return this;
    }

    public StatusSelection reversalSokhtNot(String... value) {
        addNotEquals(StatusColumns.REVERSAL_SOKHT, value);
        return this;
    }

    public StatusSelection reversalSokhtLike(String... value) {
        addLike(StatusColumns.REVERSAL_SOKHT, value);
        return this;
    }

    public StatusSelection reversalSokhtContains(String... value) {
        addContains(StatusColumns.REVERSAL_SOKHT, value);
        return this;
    }

    public StatusSelection reversalSokhtStartsWith(String... value) {
        addStartsWith(StatusColumns.REVERSAL_SOKHT, value);
        return this;
    }

    public StatusSelection reversalSokhtEndsWith(String... value) {
        addEndsWith(StatusColumns.REVERSAL_SOKHT, value);
        return this;
    }

    public StatusSelection orderByReversalSokht(boolean desc) {
        orderBy(StatusColumns.REVERSAL_SOKHT, desc);
        return this;
    }

    public StatusSelection orderByReversalSokht() {
        orderBy(StatusColumns.REVERSAL_SOKHT, false);
        return this;
    }

    public StatusSelection reversalPrintSokht(String... value) {
        addEquals(StatusColumns.REVERSAL_PRINT_SOKHT, value);
        return this;
    }

    public StatusSelection reversalPrintSokhtNot(String... value) {
        addNotEquals(StatusColumns.REVERSAL_PRINT_SOKHT, value);
        return this;
    }

    public StatusSelection reversalPrintSokhtLike(String... value) {
        addLike(StatusColumns.REVERSAL_PRINT_SOKHT, value);
        return this;
    }

    public StatusSelection reversalPrintSokhtContains(String... value) {
        addContains(StatusColumns.REVERSAL_PRINT_SOKHT, value);
        return this;
    }

    public StatusSelection reversalPrintSokhtStartsWith(String... value) {
        addStartsWith(StatusColumns.REVERSAL_PRINT_SOKHT, value);
        return this;
    }

    public StatusSelection reversalPrintSokhtEndsWith(String... value) {
        addEndsWith(StatusColumns.REVERSAL_PRINT_SOKHT, value);
        return this;
    }

    public StatusSelection orderByReversalPrintSokht(boolean desc) {
        orderBy(StatusColumns.REVERSAL_PRINT_SOKHT, desc);
        return this;
    }

    public StatusSelection orderByReversalPrintSokht() {
        orderBy(StatusColumns.REVERSAL_PRINT_SOKHT, false);
        return this;
    }

    public StatusSelection adviceSokht(String... value) {
        addEquals(StatusColumns.ADVICE_SOKHT, value);
        return this;
    }

    public StatusSelection adviceSokhtNot(String... value) {
        addNotEquals(StatusColumns.ADVICE_SOKHT, value);
        return this;
    }

    public StatusSelection adviceSokhtLike(String... value) {
        addLike(StatusColumns.ADVICE_SOKHT, value);
        return this;
    }

    public StatusSelection adviceSokhtContains(String... value) {
        addContains(StatusColumns.ADVICE_SOKHT, value);
        return this;
    }

    public StatusSelection adviceSokhtStartsWith(String... value) {
        addStartsWith(StatusColumns.ADVICE_SOKHT, value);
        return this;
    }

    public StatusSelection adviceSokhtEndsWith(String... value) {
        addEndsWith(StatusColumns.ADVICE_SOKHT, value);
        return this;
    }

    public StatusSelection orderByAdviceSokht(boolean desc) {
        orderBy(StatusColumns.ADVICE_SOKHT, desc);
        return this;
    }

    public StatusSelection orderByAdviceSokht() {
        orderBy(StatusColumns.ADVICE_SOKHT, false);
        return this;
    }

    public StatusSelection transactionPrintSokht(String... value) {
        addEquals(StatusColumns.TRANSACTION_PRINT_SOKHT, value);
        return this;
    }

    public StatusSelection transactionPrintSokhtNot(String... value) {
        addNotEquals(StatusColumns.TRANSACTION_PRINT_SOKHT, value);
        return this;
    }

    public StatusSelection transactionPrintSokhtLike(String... value) {
        addLike(StatusColumns.TRANSACTION_PRINT_SOKHT, value);
        return this;
    }

    public StatusSelection transactionPrintSokhtContains(String... value) {
        addContains(StatusColumns.TRANSACTION_PRINT_SOKHT, value);
        return this;
    }

    public StatusSelection transactionPrintSokhtStartsWith(String... value) {
        addStartsWith(StatusColumns.TRANSACTION_PRINT_SOKHT, value);
        return this;
    }

    public StatusSelection transactionPrintSokhtEndsWith(String... value) {
        addEndsWith(StatusColumns.TRANSACTION_PRINT_SOKHT, value);
        return this;
    }

    public StatusSelection orderByTransactionPrintSokht(boolean desc) {
        orderBy(StatusColumns.TRANSACTION_PRINT_SOKHT, desc);
        return this;
    }

    public StatusSelection orderByTransactionPrintSokht() {
        orderBy(StatusColumns.TRANSACTION_PRINT_SOKHT, false);
        return this;
    }


    public StatusSelection extra1(String... value) {
        addEquals(StatusColumns.EXTRA1, value);
        return this;
    }

    public StatusSelection extra1Not(String... value) {
        addNotEquals(StatusColumns.EXTRA1, value);
        return this;
    }

    public StatusSelection extra1Like(String... value) {
        addLike(StatusColumns.EXTRA1, value);
        return this;
    }

    public StatusSelection extra1Contains(String... value) {
        addContains(StatusColumns.EXTRA1, value);
        return this;
    }

    public StatusSelection extra1StartsWith(String... value) {
        addStartsWith(StatusColumns.EXTRA1, value);
        return this;
    }

    public StatusSelection extra1EndsWith(String... value) {
        addEndsWith(StatusColumns.EXTRA1, value);
        return this;
    }

    public StatusSelection orderByExtra1(boolean desc) {
        orderBy(StatusColumns.EXTRA1, desc);
        return this;
    }

    public StatusSelection orderByExtra1() {
        orderBy(StatusColumns.EXTRA1, false);
        return this;
    }

    public StatusSelection extra2(String... value) {
        addEquals(StatusColumns.EXTRA2, value);
        return this;
    }

    public StatusSelection extra2Not(String... value) {
        addNotEquals(StatusColumns.EXTRA2, value);
        return this;
    }

    public StatusSelection extra2Like(String... value) {
        addLike(StatusColumns.EXTRA2, value);
        return this;
    }

    public StatusSelection extra2Contains(String... value) {
        addContains(StatusColumns.EXTRA2, value);
        return this;
    }

    public StatusSelection extra2StartsWith(String... value) {
        addStartsWith(StatusColumns.EXTRA2, value);
        return this;
    }

    public StatusSelection extra2EndsWith(String... value) {
        addEndsWith(StatusColumns.EXTRA2, value);
        return this;
    }

    public StatusSelection orderByExtra2(boolean desc) {
        orderBy(StatusColumns.EXTRA2, desc);
        return this;
    }

    public StatusSelection orderByExtra2() {
        orderBy(StatusColumns.EXTRA2, false);
        return this;
    }

    public StatusSelection extra3(String... value) {
        addEquals(StatusColumns.EXTRA3, value);
        return this;
    }

    public StatusSelection extra3Not(String... value) {
        addNotEquals(StatusColumns.EXTRA3, value);
        return this;
    }

    public StatusSelection extra3Like(String... value) {
        addLike(StatusColumns.EXTRA3, value);
        return this;
    }

    public StatusSelection extra3Contains(String... value) {
        addContains(StatusColumns.EXTRA3, value);
        return this;
    }

    public StatusSelection extra3StartsWith(String... value) {
        addStartsWith(StatusColumns.EXTRA3, value);
        return this;
    }

    public StatusSelection extra3EndsWith(String... value) {
        addEndsWith(StatusColumns.EXTRA3, value);
        return this;
    }

    public StatusSelection orderByExtra3(boolean desc) {
        orderBy(StatusColumns.EXTRA3, desc);
        return this;
    }

    public StatusSelection orderByExtra3() {
        orderBy(StatusColumns.EXTRA3, false);
        return this;
    }
}
