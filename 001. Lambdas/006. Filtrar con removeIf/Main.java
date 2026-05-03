package Modern_java_backend_roadmap.Lambda.Ejercicio_6_Filtrar_removeIf;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Ana","Luis","Pedro", "Alberto"));

        names.removeIf(name -> name.startsWith("A"));

        System.out.println(names);
    }
}
