package Modern_java_backend_roadmap.Integración.Ejercicio_1_Aprobacion_retiro_premium;

import java.util.List;

public class User {
    private String userId;
    private String name;
    private boolean active;
    private boolean premium;
    private List<Account> accounts;

    public User(String userId, String name, boolean active, boolean premium, List<Account> accounts) {
        this.userId = userId;
        this.name = name;
        this.active = active;
        this.premium = premium;
        this.accounts = accounts;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}