package Modern_java_backend_roadmap.Stream.Ejercicio_3_Obtener_lista_balances_map;

public class Account {
    private Integer id;
    private Double balance;

    public Account(Integer id, Double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}