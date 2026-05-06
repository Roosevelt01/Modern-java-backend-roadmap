package Modern_java_backend_roadmap.Stream.Ejercicio_3_Obtener_lista_balances_map;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1, 500.0);
        Account acc2 = new Account(2, 1500.5);
        Account acc3 = new Account(3, 3000.2);

        List<Account> accounts = new ArrayList<>(List.of(acc1,acc2,acc3));

        List<Double> balance = accounts.stream().map(acc -> acc.getBalance()).toList();

        balance.forEach(System.out::println);
    }
}