package Modern_java_backend_roadmap.Stream.Ejercicio_10_Agrupacion_condicional_perfiles_tecnicos;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Developer> candidates = List.of(
            new Developer("Alex", "Java", 3),
            new Developer("María", "Python", 1),
            new Developer("Pedro", "Java", 5),
            new Developer("Luis", "Dart", 4),
            new Developer("Ana", "Python", 4),
            new Developer("Carlos", "Dart", 2)
        );

        Map<String, List<Developer>> result = candidates.stream()
                .filter(c -> c.getYearsOfExperience() >= 3)
                .collect(Collectors.groupingBy(Developer::getLanguage));

        result.forEach((language, devs) ->{
            System.out.println("Lenguaje: "+language);
            devs.forEach(dev -> System.out.println(" - "+ dev.getName()));
        });
    }
}
