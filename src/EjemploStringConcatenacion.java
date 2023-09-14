package src;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andres Guzmán";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB)); // Si lo primero que encuentra es un String concatena

        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalles2= " + detalle2 );

    }
}
