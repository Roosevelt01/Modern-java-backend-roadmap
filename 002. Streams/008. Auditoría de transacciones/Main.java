package Modern_java_backend_roadmap.Stream.Ejercicio_8_Auditoría_transacciones;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> amounts = List.of(
                100.0,
                5000.0,
                20000.0,
                300.0,
                15000.0
        );

        List<Double> result = amounts.stream()
                .peek(n -> System.out.println("Monto original: "+n))
                .filter(n -> n >1000)
                .peek(n -> System.out.println("Monto aprobado: "+n))
                .map(n -> n * 1.10)
                .toList();

        result.forEach(System.out::println);
    }
}
