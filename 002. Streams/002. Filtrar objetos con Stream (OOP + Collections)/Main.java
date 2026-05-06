package Modern_java_backend_roadmap.Stream.Ejercicio_2_Filtrar_objetos_Stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1, 500.00);
        Account acc2 = new Account(2, 1500.50);
        Account acc3 = new Account(3, 3000.20);

        List<Account> accounts = new ArrayList<>(List.of(acc1, acc2, acc3));

        accounts
                .stream()
                .filter(acc -> acc.getBalance() > 1000)
                .forEach(acc -> System.out.println(acc.getBalance()));
    }
}