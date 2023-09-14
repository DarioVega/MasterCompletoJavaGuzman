package src;

public class PrimitivosCaracteres {

    public static void main(String[] args) {
        
        char caracter = '\u0040'; //forma unicode
        char decimal = 64; //forma decimal
        
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = caracter: " + (decimal == caracter));
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = caracter: " + (simbolo == caracter));

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);

        char espacio = ' ';
        char espacioUnicode = '\u0020'; //unicode para espacio en blanco
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornaCarro = '\r';

        System.out.println("char corresponde en byte: " + System.getProperty("line.separator")); //ubica el retorno de carro de nuestro S.O
        System.out.println("char corresponde en byte: " + System.lineSeparator()); //es igual al de arriba pero en método
        System.out.println("char corresponde en byte = " + retornaCarro + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MIN_VALUE = " + Character.MAX_VALUE);


    }
    
}
