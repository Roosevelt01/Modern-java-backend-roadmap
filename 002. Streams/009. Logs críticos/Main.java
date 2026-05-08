package Modern_java_backend_roadmap.Stream.Ejercicio_9_Logs_criticos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> logs = List.of(
                "INFO: User login",
                "ERROR: Database failed",
                "WARN: CPU high",
                "ERROR: Timeout",
                "INFO: Payment success"
        );

        List<String> result = logs.stream()
                .filter(c -> c.startsWith("ERROR: "))
                .map(c -> c.replace("ERROR: ", "").toUpperCase())
                .sorted()
                .toList();

        result.forEach(System.out::println);
    }
}