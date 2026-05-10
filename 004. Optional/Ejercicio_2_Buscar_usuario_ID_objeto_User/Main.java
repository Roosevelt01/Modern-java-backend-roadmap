package Modern_java_backend_roadmap.Optional.Ejercicio_2_Buscar_usuario_ID_objeto_User;

import java.util.Optional;

public class Main {
    public static Optional<User> findUserById(int id){
        if(id == 1){
            return Optional.of(new User(1, "Alex", "rodri297@gmail.com"));
        }else if(id == 2){
            return Optional.of(new User(2, "Jason", "jason247@gmail.com"));
        }else {
            return Optional.empty();
        }
    }

    public static void printUsers(Optional<User> user){
        if(user.isPresent()){
            System.out.println(user.get().getName());
            System.out.println(user.get().getEmail());
        }else{
            System.out.println("Usuario no encontrado");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Optional<User> user1 = findUserById(1);
        Optional<User> user2 = findUserById(2);
        Optional<User> user3 = findUserById(3);

        printUsers(user1);
        printUsers(user2);
        printUsers(user3);
    }
}