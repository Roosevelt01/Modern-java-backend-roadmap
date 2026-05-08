package Modern_java_backend_roadmap.Stream.Ejercicio_11_Reporte_errores_criticos_API;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<ServerLog> logs = List.of(
                new ServerLog("/api/users", 200, 120),
                new ServerLog("/api/payments", 500, 850),
                new ServerLog("/api/users", 500, 900),
                new ServerLog("/api/products", 200, 80),
                new ServerLog("/api/payments", 500, 920),
                new ServerLog("/api/payments", 200, 150),
                new ServerLog("/api/users", 500, 880)
        );

        Map<String, Long> result = logs.stream()
                .filter(c -> c.getStatusCode() == 500)
                .collect(Collectors.groupingBy(
                        ServerLog::getEndpoint,
                        Collectors.counting()
                ));

        result.forEach((endpoint, cantidadErrores) ->
                System.out.println("Endpoint: " + endpoint + " -> Fallos: " + cantidadErrores)
        );
    }
}
