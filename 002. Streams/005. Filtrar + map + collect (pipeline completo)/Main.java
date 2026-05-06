package Modern_java_backend_roadmap.Stream.Ejercicio_5_Filtrar_map_collect;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = List.of(
                new Account(1, 500.00),
                new Account(2, 1500.5),
                new Account(3, 3000.2),
                new Account(4, 200.0)
        );

        List<Double> balances = accounts
                .stream()
                .filter(acc -> acc.getBalance() > 1000)
                .map(acc -> acc.getBalance())
                .toList();

        System.out.println(balances);
    }
}
