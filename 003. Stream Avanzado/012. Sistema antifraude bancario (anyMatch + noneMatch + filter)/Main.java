package Modern_java_backend_roadmap.Stream_Avanzado.Ejercicio_12_Sistema_antifraude_bancario;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction(1, 1500.0, "Spain", false),
                new Transaction(2, 8500.0, "Italy", false),
                new Transaction(3, 12000.0, "USA", true),
                new Transaction(4, 400.0, "North Korea", false),
                new Transaction(5, 6000.0, "Spain", false)
        );

        // 1. Filtramos transacciones mayores a 5000
        List<Transaction> highValue = transactions.stream()
                .filter(c -> c.getAmount() > 5000)
                .toList();

        // 2. Evaluamos SOBRE LA LISTA FILTRADA (highValue)

        // Verificar si existe al menos una transacción fraudulenta
        boolean hasFraud = highValue.stream()
                .anyMatch(Transaction::isFraudulent);

        // Lista blanca de países permitidos
        Set<String> allowedCountries = Set.of("USA", "Spain", "Italy");

        // Verificar si TODAS provienen de países permitidos
        boolean allFromAllowed = highValue.stream()
                .allMatch(c -> allowedCountries.contains(c.getCountry()));

        // Verificar que NINGUNA venga de "North Korea"
        boolean noneFromSanctioned = highValue.stream()
                .noneMatch(c -> c.getCountry().equalsIgnoreCase("North Korea"));

        // Reporte de Auditoría
        System.out.println("📊 REPORTE DEL LOTE DE ALTO VALOR:");
        System.out.println("Total transacciones a evaluar: " + highValue.size());
        System.out.println("🚨 ¿Contiene fraude?: " + hasFraud);
        System.out.println("🌍 ¿Todas de países permitidos?: " + allFromAllowed);
        System.out.println("🛡️ ¿Limpio de países sancionados?: " + noneFromSanctioned);
    }
}