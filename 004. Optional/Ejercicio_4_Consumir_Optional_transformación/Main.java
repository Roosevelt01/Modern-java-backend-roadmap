package Modern_java_backend_roadmap.Optional.Ejercicio_4_Consumir_Optional_transformación;

import java.util.Optional;

public class Main {
    public static Optional<String> findName(int id){
        if(id == 1){
            return Optional.of("alex");
        }
        return Optional.empty();
    }

    public static void printName(Optional<String> user){
        if(user.isPresent()){
            System.out.println(user.get().toUpperCase());
        }else{
            System.out.println("Usuario no encontrado");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Optional<String> user1 = findName(1);
        Optional<String> user2 = findName(3);

        printName(user1);
        printName(user2);
    }
}
