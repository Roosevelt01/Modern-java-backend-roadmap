package Modern_java_backend_roadmap.Lambda.Ejer+cicio_7_Crear_Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> esLargo = s -> s.length() > 4;

        List<String> names = new ArrayList<>(List.of("Ana","Luis","Pedro", "Alberto"));

        names.removeIf(esLargo.negate());

        names.forEach(System.out::println);
    }
}