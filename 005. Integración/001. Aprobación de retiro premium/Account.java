package Modern_java_backend_roadmap.Integración.Ejercicio_1_Aprobacion_retiro_premium;

public class Account {
    private String accountId;
    private double balance;
    private boolean active;
    private boolean blocked;
    private boolean primary;

    public Account(String accountId, double balance, boolean active, boolean blocked, boolean primary) {
        this.accountId = accountId;
        this.balance = balance;
        this.active = active;
        this.blocked = blocked;
        this.primary = primary;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }
}