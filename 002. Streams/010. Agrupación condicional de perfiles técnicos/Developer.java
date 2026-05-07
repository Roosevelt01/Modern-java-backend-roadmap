package Modern_java_backend_roadmap.Stream.Ejercicio_10_Agrupacion_condicional_perfiles_tecnicos;

public class Developer {
    private String name;
    private String language;
    private Integer yearsOfExperience;

    public Developer(String name, String language, Integer yearsOfExperience) {
        this.name = name;
        this.language = language;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
