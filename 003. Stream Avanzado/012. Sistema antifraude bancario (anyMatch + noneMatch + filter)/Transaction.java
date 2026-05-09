package Modern_java_backend_roadmap.Stream_Avanzado.Ejercicio_12_Sistema_antifraude_bancario;

public class Transaction {
    private int id;
    private double amount;
    private String country;
    private boolean fraudulent;

    public Transaction(int id, double amount, String country, boolean fraudulent) {
        this.id = id;
        this.amount = amount;
        this.country = country;
        this.fraudulent = fraudulent;
    }

    public int getId() { return id; }

    public double getAmount() { return amount; }

    public String getCountry() { return country; }

    public boolean isFraudulent() {  return fraudulent;  }
}
