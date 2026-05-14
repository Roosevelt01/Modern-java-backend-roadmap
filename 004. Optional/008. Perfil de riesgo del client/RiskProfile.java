package Modern_java_backend_roadmap.Optional.Ejercicio_8_Perfil_riesgo_cliente;

public class RiskProfile {
    private String customerId;
    private int creditScore;
    private boolean politicallyExposed;

    public RiskProfile(String customerId, int creditScore, boolean politicallyExposed) {
        this.customerId = customerId;
        this.creditScore = creditScore;
        this.politicallyExposed = politicallyExposed;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public boolean isPoliticallyExposed() {
        return politicallyExposed;
    }

    public void setPoliticallyExposed(boolean politicallyExposed) {
        this.politicallyExposed = politicallyExposed;
    }
}
