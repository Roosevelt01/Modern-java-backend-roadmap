package Modern_java_backend_roadmap.Lambda.Ejercicio_4_Lambda_Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> cuentas = new HashMap<>();

        cuentas.put("A1", 1000.0);
        cuentas.put("A2", 250.5);
        cuentas.put("A3", 5000.0);

        cuentas.forEach((id, saldo) -> {
            System.out.println("Cuenta " + id + " -> Saldo " + saldo);
        });
    }
}
