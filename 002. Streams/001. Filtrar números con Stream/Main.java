package Modern_java_backend_roadmap.Stream.Ejercicio_1_Filtrar_numeros_Stream;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);

        numbers.stream().filter(n -> n > 20).forEach(System.out::println);
    }
}