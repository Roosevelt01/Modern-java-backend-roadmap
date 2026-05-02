package Modern_java_backend_roadmap.Lambda.Ejercicio_1_Imprimir_lista_lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> void printList(List<T> list){
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> language = new ArrayList<>(List.of("Java","Python","PHP","C"));
        printList(language);
    }
}
