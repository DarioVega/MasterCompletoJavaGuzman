package src;

import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero: "); //Pide entrada de datos por pantalla
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error: debe ingresar un número entero");
            main(args); // Quiero que si ocurre un error se ejecute main nuevamente
            System.exit(0); // Quiero salir de la ejecución, tabien lo puedo hacer con return sin retornar nada
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBInario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBInario);

        int numeroBinario = 0b111110100; // se antepone 0b para que la máquina entienda que es un binario
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 0764; // se antepone 0 para que la máquina interprete que es octal
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numeroHex = 0x1f4; // se antepone 0x para que la máquina interprete que es un hexadecimal
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBInario + ", \n";
        mensaje += resultadoOctal + ", \n";
        mensaje += resultadoHex;
        JOptionPane.showMessageDialog(null,mensaje);

    }

}
