package Modern_java_backend_roadmap.Optional.Ejercicio_7_Registro_obligatorio_operation_financiera;

public class AuditEvent {
    private String transactionId;
    private String message;

    public AuditEvent(String transactionId, String message) {
        this.transactionId = transactionId;
        this.message = message;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
