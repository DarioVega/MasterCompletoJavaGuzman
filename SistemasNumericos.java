public class SistemasNumericos {

    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + "=" + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100; // se antepone 0b para que la máquina entienda que es un binario
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764; // se antepone 0 para que la máquina interprete que es octal

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4; // se antepone 0x para que la máquina interprete que es un hexadecimal
        System.out.println("numeroHex = " + numeroHex);

    }

}
