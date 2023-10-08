package ir.co.pna.test_urovoi9100;

// @formatter:off

import androidx.annotation.Nullable;

/**
 * Data model for the {@code status} table.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public interface StatusModel extends BaseModel {

    /**
     * Primary key.
     */
    long getId();

    /**
     * Get the {@code status_id} value.
     * Can be {@code null}.
     */
    @Nullable
    String getStatusId();

    /**
     * Get the {@code reversal} value.
     * Can be {@code null}.
     */
    @Nullable
    String getReversal();

    /**
     * Get the {@code reversal_print} value.
     * Can be {@code null}.
     */
    @Nullable
    String getReversalPrint();

    /**
     * Get the {@code advice} value.
     * Can be {@code null}.
     */
    @Nullable
    String getAdvice();

    /**
     * Get the {@code transaction_print} value.
     * Can be {@code null}.
     */
    @Nullable
    String getTransactionPrint();

    /**
     * Get the {@code reversal sokht} value.
     * Can be {@code null}.
     */
    @Nullable
    String getReversalSokht();

    /**
     * Get the {@code reversal_print_sokht} value.
     * Can be {@code null}.
     */
    @Nullable
    String getReversalPrintSokht();

    /**
     * Get the {@code advice_sokht} value.
     * Can be {@code null}.
     */
    @Nullable
    String getAdviceSokht();

    /**
     * Get the {@code transaction_print_sokht} value.
     * Can be {@code null}.
     */
    @Nullable
    String getTransactionPrintSokht();


    /**
     * Get the {@code extra1} value.
     * Can be {@code null}.
     */
    @Nullable
    String getExtra1();

    /**
     * Get the {@code extra2} value.
     * Can be {@code null}.
     */
    @Nullable
    String getExtra2();

    /**
     * Get the {@code extra3} value.
     * Can be {@code null}.
     */
    @Nullable
    String getExtra3();
}
