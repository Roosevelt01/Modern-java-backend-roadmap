package Modern_java_backend_roadmap.Integración.Ejercicio_1_Aprobacion_retiro_premium;

public class WithdrawalRequest {
    private String userId;
    private double amount;

    public WithdrawalRequest(String userId, double amount) {
        this.userId = userId;
        this.amount = amount;
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
}
