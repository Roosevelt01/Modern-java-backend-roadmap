package Modern_java_backend_roadmap.Lambda.Ejercicio_9_Metodo_Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void procesar(List<String> list, Consumer<String> accion){
        for(String item: list){
            accion.accept(item);
        }
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Ana","Luis","Pedro", "Alberto"));

        System.out.println("Imprime nombres");
        procesar(names, System.out::println);

        System.out.println("\nImprime nombres en mayúscula");
        procesar(names, name -> System.out.println(name.toUpperCase()));

    }
}
