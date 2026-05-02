package Modern_java_backend_roadmap.Lambda.Ejercicio_2_Imprimir_atributos_de_objetos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1,1200.00);
        Account acc2 = new Account(2,150.50);

        List<Account> accounts = new ArrayList<>(List.of(acc1,acc2));

        accounts.forEach(acc -> System.out.println(acc.getBalance()));
    }
}
