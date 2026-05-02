package Modern_java_backend_roadmap.Lambda.Ejercicio_3_Herencia_Polimorfismo_Lambda;

public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Está gestionando el equipo");
    }
}
