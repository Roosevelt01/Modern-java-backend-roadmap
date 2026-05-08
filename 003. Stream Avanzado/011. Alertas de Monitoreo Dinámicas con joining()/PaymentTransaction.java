package Modern_java_backend_roadmap.Stream_Avanzado.Ejercicio_11_Alertas_Monitoreo_Dinamicas_joining;

public class PaymentTransaction {

    private String transactionId;
    private double amount;
    private String status;
    private String errorCode;

    public PaymentTransaction(String transactionId, double amount, String status, String errorCode) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.status = status;
        this.errorCode = errorCode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
