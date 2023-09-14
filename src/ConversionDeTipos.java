package src;

public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";
        
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
        
        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);
        
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        otroNumeroStr = String.valueOf(otroNumeroInt + 10); // String tiene el método valueOf que acepta varios tipos de primitivos y los convierte a String
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.2345e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        
        otroRealStr = String.valueOf(1.2345e2F);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 32767; // Si pusiera 32768 sería mayor a lo que soporta short, puedo forzarlo con castig pero puedo perder información
        short s = (short) i;  // El int es de 32 bits y el short de 16. Hay qu forzar la conversión con un casting
        System.out.println("s = " + s);
        long l = i;  // El tipo int es menor a long, por eso lo toma
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        // Hay tipos que son incompatbles, ejemplo de un int a un boolean
        // Por lo general voy a poder convertir tipos numéricos
    }
}
