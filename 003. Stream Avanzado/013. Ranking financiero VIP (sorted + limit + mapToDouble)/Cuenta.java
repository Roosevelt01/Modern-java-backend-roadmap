package Modern_java_backend_roadmap.Stream_Avanzado.Ejercicio_13_Ranking_financiero_vip;

public class Cuenta {
    private int accountId;
    private String owner;
    private double balance;

    public Cuenta(int accountId, String owner, double balance) {
        this.accountId = accountId;
        this.owner = owner;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}