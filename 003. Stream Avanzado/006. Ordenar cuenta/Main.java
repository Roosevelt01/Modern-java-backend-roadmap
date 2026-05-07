package Modern_java_backend_roadmap.Stream_Avanzado.Ejercicio_6_Ordenar_cuenta;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> accounts = List.of(1500.00, 1000.00, 3000.00, 500.00);

        accounts.stream()
                .sorted((a, b) -> Double.compare(b,a))
                .forEach(System.out::println);
    }
}
