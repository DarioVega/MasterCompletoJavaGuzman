package src;

import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt(); // con nextInt no necesito capturar un String y convertirlo a int
        }catch (NumberFormatException e){ // También podría usar Exception ya que todas herendan de ella
            System.out.println("Error: debe ingresar un número entero");
            main(args); // Quiero que si ocurre un error se ejecute main nuevamente
            System.exit(0); // Quiero salir de la ejecución, tabien lo puedo hacer con return sin retornar nada
        }


        System.out.println("numeroDecimal = " + numeroDecimal);
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "numero octal de " + resultadoBinario + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario + ", \n";
        mensaje += resultadoOctal + ", \n";
        mensaje += resultadoHex;

        System.out.println(mensaje);

    }

}
