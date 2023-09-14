package src;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Andres";
        System.out.println("nombre.length() = " + nombre.length() );
        System.out.println("nombre.toUpperCase()  = " + nombre.toUpperCase() );
        System.out.println("nombre.toLowerCase()  = " + nombre.toLowerCase() );
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres")); // compara con orden lexicográfico (UNICODE) si es cierto devuelve 0
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron")); // siempre devuelve un int
        System.out.println("nombre.charAt(0) = " + nombre.charAt(5)); // Devuelve el caracter en la posicion que yo le pase
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length() - 1)); // Devuelve el caracter en la posicion que yo le pase
        System.out.println("nombre.substring(1) = " + nombre.substring(1)); // Devuelve una parte de una cadena
        System.out.println("nombre.substring(0) = " + nombre.substring(0));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf('t'));
        System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith('tr') = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith('tr') = " + trabalenguas.endsWith("tr"));
        System.out.println("  trabalenguas");
        System.out.println("  trabalenguas ".trim()); // trim quita los espacios en blanco al comienzo y al final






    }
}
