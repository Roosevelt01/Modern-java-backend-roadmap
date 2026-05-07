package Modern_java_backend_roadmap.Stream_Avanzado.Ejercicio_3_Validar_condición_todas_cuentas_allMatch;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> accounts = List.of(1500.00,1000.00,3000.00,500.00);

        boolean exists = accounts.stream().allMatch(c -> c > 100);

        System.out.println("¿Todas las cuentas tienen un saldo mayor a 100? "+ exists);

    }
}