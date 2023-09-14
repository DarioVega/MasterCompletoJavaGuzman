package src;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        String archivo = "alguna_imagen.jpeg";
        int i = archivo.lastIndexOf("."); // uso lastIndexOf por si el nombre del archivo tiene otro punto
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.subString(i+1))" + archivo.substring(i+1));

    }
}
