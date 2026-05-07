package Modern_java_backend_roadmap.Stream_Avanzado.Ejercicio_1_Contar_cuentas_saldo_alto;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> accounts = List.of(1500.00,1000.00,3000.00,500.00);

        long total = accounts.stream()
                .filter(c -> c > 1000)
                .count();

        System.out.println(total);
    }
}