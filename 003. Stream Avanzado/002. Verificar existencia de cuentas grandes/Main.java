package Modern_java_backend_roadmap.Stream_Avanzado.Ejercicio_2_Verificar_existencia_cuentas_grandes;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> accounts = List.of(1500.00,1000.00,3000.00,500.00);

        boolean exists = accounts.stream().anyMatch(c -> c > 2500);

        System.out.println("¿Existe al menos una cuenta con saldo mayor a 2500? "+exists);
    }
}