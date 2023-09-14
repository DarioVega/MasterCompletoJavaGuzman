package src;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java"; // este crea el objeto literal
        String curso2 = new String("Programación Java"); // este crea una referencia
     
        boolean esIgual = curso == curso2;
        System.out.println("es igual = " + esIgual);
        
        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);
        
        String curso3 = "Programación Java";
        esIgual = curso == curso3; // como es igual que curso crea la referencia
        System.out.println("es igual = " + esIgual);
    }
}
