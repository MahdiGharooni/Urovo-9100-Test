package ir.co.pna.test_urovoi9100;
public class StatusEntity {
    private String mId;
    private String reversal;
    private String reversalPrint;
    private String advice;
    private String transactionPrint;
    private String reversalSokht;
    private String reversalPrintSokht;
    private String adviceSokht;
    private String transactionPrintSokht;
    private String shaparakPrint;


    public StatusEntity(String mId, String reversal, String reversalPrint, String advice, String transactionPrint, String reversalSokht, String reversalPrintSokht, String adviceSokht, String transactionPrintSokht,String shaparakPrint) {
        this.mId = mId;
        this.reversal = reversal;
        this.reversalPrint = reversalPrint;
        this.advice = advice;
        this.transactionPrint = transactionPrint;
        this.reversalSokht = reversalSokht;
        this.reversalPrintSokht = reversalPrintSokht;
        this.adviceSokht = adviceSokht;
        this.transactionPrintSokht = transactionPrintSokht;
        this.shaparakPrint = shaparakPrint;
    }

    public String getReversal() {
        return reversal;
    }

    public String getReversalPrint() {
        return reversalPrint;
    }

    public String getAdvice() {
        return advice;
    }

    public String getTransactionPrint() {
        return transactionPrint;
    }

    public String getmId() {
        return mId;
    }

    public String getReversalSokht() {
        return reversalSokht;
    }

    public String getReversalPrintSokht() {
        return reversalPrintSokht;
    }

    public String getAdviceSokht() {
        return adviceSokht;
    }

    public String getTransactionPrintSokht() {
        return transactionPrintSokht;
    }

    public String getShaparakPrint() {
        return shaparakPrint;
    }
}
