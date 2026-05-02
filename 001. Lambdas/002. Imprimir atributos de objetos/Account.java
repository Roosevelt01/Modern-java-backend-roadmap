package Modern_java_backend_roadmap.Lambda.Ejercicio_2_Imprimir_atributos_de_objetos;

public class Account {
    private Integer id;
    private Double balance;

    public Account(Integer id, Double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Integer getId() { return id;  }

    public void setId(Integer id) { this.id = id;  }

    public Double getBalance() {  return balance;  }

    public void setBalance(Double balance) { this.balance = balance; }
}
