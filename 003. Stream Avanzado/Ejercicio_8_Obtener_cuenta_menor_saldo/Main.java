package Modern_java_backend_roadmap.Stream_Avanzado.Ejercicio_8_Obtener_cuenta_menor_saldo;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Double> accounts = List.of(1500.00, 1000.00, 3000.00, 500.00);

        Optional<Double> min = accounts.stream()
                .min((a, b) -> Double.compare(a, b));

        min.ifPresent(System.out::println);
    }
}
