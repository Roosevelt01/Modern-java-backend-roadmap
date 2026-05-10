package Modern_java_backend_roadmap.Optional.Ejercicio_5_Valor_defecto;

import java.util.Optional;

public class Main {
    public static Optional<String> findName(int id){
        if(id==1){
            return Optional.of("Alex");
        }
        return Optional.empty();
    }

    public static void printName(String user){
        System.out.println(user);
        System.out.println();
    }

    public static void main(String[] args) {
        String user1 = findName(1).orElse("Usuario no encontrado");
        String user2 = findName(2).orElse("Usuario no encontrado");

        printName(user1);
        printName(user2);
    }
}
