package Modern_java_backend_roadmap.Stream_Avanzado.Ejercicio_11_Alertas_Monitoreo_Dinamicas_joining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<PaymentTransaction> batch = Arrays.asList(
                new PaymentTransaction("TX-1001", 150.00, "SUCCESS", "NONE"),
                new PaymentTransaction("TX-1002", 1200.50, "FAILED", "INSUFFICIENT_FUNDS"),
                new PaymentTransaction("TX-1003", 500.00, "FAILED", "TIMEOUT"),
                new PaymentTransaction("TX-1004", 3500.00, "FAILED", "FRAUD_SUSPICION"),
                new PaymentTransaction("TX-1005", 2000.00, "SUCCESS", "NONE"),
                new PaymentTransaction("TX-1006", 1000.00, "FAILED", "TIMEOUT")
        );

        String result = batch.stream()
                .filter(c -> c.getStatus().equals("FAILED") && c.getAmount() >= 1000)
                .sorted((a, b) -> Double.compare(b.getAmount(), a.getAmount()))
                .map(c -> c.getTransactionId() + " (" + c.getErrorCode() + ")")
                .collect(Collectors.joining(
                        ", ",
                        "🚨 ALERTA CRÍTICA: Se detectaron fallos VIP [",
                        "] - Por favor revisar logs de inmediato."
                ));

        System.out.println(result);
    }
}