package Modern_java_backend_roadmap.Stream.Ejercicio_4_Filtrar_transacciones_sumarlas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> transacciones = List.of(100.0, 500.0, 1200.0, 50.0);

        double total =transacciones
                .stream()
                .filter(c -> c > 100)
                .mapToDouble(Double::doubleValue).sum();

        System.out.println(total);
    }
}