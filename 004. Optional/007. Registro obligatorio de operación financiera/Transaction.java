package Modern_java_backend_roadmap.Optional.Ejercicio_7_Registro_obligatorio_operation_financiera;

public class Transaction {
    private String transactionId;
    private String userId;
    private double amount;
    private String type;

    public Transaction(String transactionId, String userId, double amount, String type) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.amount = amount;
        this.type = type;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}