package Modern_java_backend_roadmap.Stream_Avanzado.Ejercicio_5_Ordenar_cuentas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> accounts = List.of(1500.00, 1000.00, 3000.00, 500.00);

        accounts.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
