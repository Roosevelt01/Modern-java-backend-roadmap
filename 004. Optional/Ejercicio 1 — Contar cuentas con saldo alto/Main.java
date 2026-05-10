package Modern_java_backend_roadmap.Optional.Ejercicio_1_Contar_cuentas_saldo_alto;

import java.util.Optional;

public class Main {
    public static Optional<String> findName(int id){
        if(id == 1){
            return Optional.of("Alex");
        }

        return Optional.empty();
    }

    public static void main(String[] args) {

        Optional<String> result = findName(1);
        System.out.println(result);

    }
}
