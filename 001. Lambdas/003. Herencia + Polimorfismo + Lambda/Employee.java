package Modern_java_backend_roadmap.Lambda.Ejercicio_3_Herencia_Polimorfismo_Lambda;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract void work();
}
