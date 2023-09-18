package src;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre incremento
        int i = 1;
        int j = ++i; // i = i + 1
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        //Post incremento
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++; // primero se asigna y despues se incrementa
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre- decremento
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);


    }
}
