package Modern_java_backend_roadmap.Stream.Ejercicio_6_Crear_toMap;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
            new User(1, "Alex"),
                new User(2, "Maria")
        );

        Map<Integer, User> userMap = users.stream()
                .collect(Collectors.toMap(
                    User::getId,
                        Function.identity()
                ));

        userMap.forEach((id,user) -> System.out.println("id: "+id+" - User: "+ user.getName()));

    }
}
