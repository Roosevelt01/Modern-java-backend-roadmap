package Modern_java_backend_roadmap.Optional.Ejercicio_7_Registro_obligatorio_operation_financiera;

import java.util.Optional;

public class Main {
    public static Optional<AuditEvent> createAuditEvent(Transaction transaction) {
        return Optional.of(transaction)
                .map(t -> {
                    String message = "Transaction " + t.getTransactionId()
                            + " of type " + t.getType()
                            + " for user " + t.getUserId()
                            + " was registered.";

                    return new AuditEvent(t.getTransactionId(), message);
                });
    }

    public static void main(String[] args) {
        System.out.println("--- PRUEBA 1: Caso Válido ---");

        Transaction tr = new Transaction("TX-001", "U-10", 500.0, "TRANSFER");

        Optional<AuditEvent> event = createAuditEvent(tr);

        event.ifPresent(e -> System.out.println(e.getMessage()));

        System.out.println("\n--- PRUEBA 2: Caso Null ---");

        Transaction nullTransaction = null;

        Optional<AuditEvent> event2 = createAuditEvent(nullTransaction);

        event2.ifPresent(e -> System.out.println(e.getMessage()));
    }
}