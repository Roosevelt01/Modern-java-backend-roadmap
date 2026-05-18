package Modern_java_backend_roadmap.Method_references.Ejercicio_1_limpieza_usuarios_activos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Jason","rodri278@gmail.com", false),
                new User("Alejandro","alex88@gmail.com", true),
                new User("Ada","adalicia92@gmail.com", true),
                new User("Nidia","nidia192@gmail.com", false),
                new User("Jose","jose1955@gmail.com", true)
        );

        //Versión lambda
        /*List<String> emails = users.stream()
                .filter(user -> user.isActive())
                .map(user -> user.getEmail())
                .toList();*/

        List<String> emails = users.stream()
                .filter(User::isActive)
                .map(User::getEmail)
                .toList();

        emails.forEach(System.out::println);
    }
}
