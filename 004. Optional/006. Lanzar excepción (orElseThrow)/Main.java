package Modern_java_backend_roadmap.Optional.Ejercicio_6_Lanzar_excepcion;

import java.util.Optional;

public class Main {
        public static Optional<String> findName(int id){
            if(id == 1){
                return Optional.of("Alex");
            }
            return Optional.empty();
        }

        public static void main(String[] args) {

            String user = findName(2)
                    .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

            System.out.println(user);
        }
}
