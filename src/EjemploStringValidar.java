package src;

public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null; // null significa que no tiene una referencia

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        // Cuando la referencia es nula me tira NullPointerException
        // Para prevenirlo, puedo validar con un if y poner un valor por defecto
        if(esNulo){
            curso = "Programación Java";
        }

        boolean esVacio = curso.length() == 0; //la función isEmpty realiza esto mismo por detras

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank(); // isBLank valida que no sea NULL, que no sea empty y que no sea blank
        System.out.println("esBlanco = " + esBlanco);

        if (esBlanco == false) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }

}
