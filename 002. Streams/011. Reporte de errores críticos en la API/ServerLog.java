package Modern_java_backend_roadmap.Stream.Ejercicio_11_Reporte_errores_criticos_API;

public class ServerLog {
    private String endpoint;
    private int statusCode;
    private int responseTimeMs;

    public ServerLog(String endpoint, int statusCode, int responseTimeMs) {
        this.endpoint = endpoint;
        this.statusCode = statusCode;
        this.responseTimeMs = responseTimeMs;
    }

    public String getEndpoint() { return endpoint; }
    public int getStatusCode() { return statusCode; }
    public int getResponseTimeMs() { return responseTimeMs; }

    @Override
    public String toString() {
        return "Log{" + endpoint + " | Status: " + statusCode + " | " + responseTimeMs + "ms}";
    }
}