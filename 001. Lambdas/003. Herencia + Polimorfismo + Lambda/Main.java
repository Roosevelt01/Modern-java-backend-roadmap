package Modern_java_backend_roadmap.Lambda.Ejercicio_3_Herencia_Polimorfismo_Lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Developer("Alex"),
                new Manager("Pedro")
        ));

        employees.forEach(emp -> emp.work());

    }
}
