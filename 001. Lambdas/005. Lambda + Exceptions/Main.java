package Modern_java_backend_roadmap.Lambda.Ejercicio_5_Lambda_Exceptions;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> valores = List.of("100", "255", "error", "400");

        valores.forEach(s -> {
            try{
                int num = Integer.parseInt(s);
                System.out.println(valores);
            }catch(NumberFormatException ex){
                System.out.println("Error: "+ex);
            }
        });
    }
}
