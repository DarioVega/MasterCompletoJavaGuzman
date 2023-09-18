package src;

import java.security.PrivilegedAction;

public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;

        for(int i = 0; i < largo; i++){
            System.out.print(arreglo[i]);
        }

        System.out.println();

        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;

        for(int j=0;j<l;j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("[.]"); // para escapar se puede usar \\ o corchetes
        l = archivoArr.length;
        System.out.println("l = " + l);
        for(int j = 0; j < l; j++){
            System.out.println(archivoArr[j]);
        }

        System.out.println("extension = " + archivoArr[l-1]);

        String nombre = "dario";


    }
}
