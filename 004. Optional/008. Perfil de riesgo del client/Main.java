package Modern_java_backend_roadmap.Optional.Ejercicio_8_Perfil_riesgo_cliente;

import java.util.Optional;

public class Main {
    public static String evaluateRisk(RiskProfile profile){
        return Optional.ofNullable(profile)
                .map(p -> {
                    if(p.isPoliticallyExposed()){
                        return "Riesgo alto";
                    }

                    if(p.getCreditScore()<=600){
                        return "Riesgo medio";
                    }

                    return "Riesgo bajo";

                }).orElse("Riesgo desconocido");
    }

    public static void main(String[] args) {
        RiskProfile p1 = new RiskProfile("C-001", 720, false);
        RiskProfile p2 = new RiskProfile("C-002", 550, false);
        RiskProfile p3 = new RiskProfile("C-003", 800, true);
        RiskProfile p4 = null;

        System.out.println(evaluateRisk(p1));
        System.out.println(evaluateRisk(p2));
        System.out.println(evaluateRisk(p3));
        System.out.println(evaluateRisk(p4));

    }
}
