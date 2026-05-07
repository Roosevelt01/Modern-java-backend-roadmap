package Modern_java_backend_roadmap.Stream_Avanzado.Ejercicio_7_Obtener_cuenta_mayor_saldo;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Double> accounts = List.of(1500.00, 1000.00, 3000.00, 500.00);

        Optional<Double> max = accounts.stream()
                .max((a, b) -> Double.compare(a,b));

        max.ifPresent(System.out::println);
    }
}
