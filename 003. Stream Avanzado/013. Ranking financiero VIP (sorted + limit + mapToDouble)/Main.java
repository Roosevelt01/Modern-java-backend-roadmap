package Modern_java_backend_roadmap.Stream_Avanzado.Ejercicio_13_Ranking_financiero_vip;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Cuenta> accounts = List.of(
                new Cuenta(101, "Alex", 1500.50),
                new Cuenta(102, "Maria", 125000.00),
                new Cuenta(103, "Pedro", 800.00),
                new Cuenta(104, "Luis", 45000.75),
                new Cuenta(105, "Ana", 300000.00),
                new Cuenta(106, "Carlos", 95000.20),
                new Cuenta(107, "Sofia", 150000.00)
        );

        List<Cuenta> accountVip = accounts.stream()
                .sorted(Comparator.comparingDouble(Cuenta::getAccountId).reversed())
                .limit(5)
                .toList();

        Double averageBalance = accountVip.stream()
                .mapToDouble(Cuenta::getBalance)
                .average()
                .orElse(0.0);

        String vipNames = accountVip.stream()
                .map(Cuenta::getOwner)
                .collect(Collectors.joining(", "));

        System.out.println("📊 REPORTE DE LIQUIDEZ VIP (Top 5):");
        System.out.println("Dueños de cuentas premium: [" + vipNames + "]");
        System.out.printf("Ticket Promedio del segmento VIP: $%,.2f\n", averageBalance);
    }
}