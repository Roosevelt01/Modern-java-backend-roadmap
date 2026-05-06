package Modern_java_backend_roadmap.Stream.Ejercicio_7_Limpieza_transformation_control;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> emails = List.of(
                "alex@mail.com",
                "  maria@mail.com  ",
                "ALEX@mail.com",
                "pedro@mail.com",
                "maria@mail.com"
        );

        List<String> result = emails
                .stream()
                .map(String::trim)
                .map(String::toLowerCase)
                .distinct()
                .filter(e -> e.contains("mail"))
                .toList();

        result.forEach(System.out::println);

    }
}
