package Modern_java_backend_roadmap.Stream_Avanzado.Ejercicio_10_Pipeline_completo_tipo_backend;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Double> accounts = List.of(1500.00, 1000.00, 3000.00, 500.00, 150.00);

        Optional<Double> result = accounts.stream()
                .filter(c -> c > 1000)
                .sorted(((a, b) -> Double.compare(b,a)))
                .findFirst();

        result.ifPresent(System.out::println);
    }
}
