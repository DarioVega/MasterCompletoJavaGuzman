package src;

public class PrimitivosFloat {

       public static void main(String[] args) {

        float realFLoat = 2120F;
        //float realFLoat = 2.12e3F;   //la e significa 10 elevado a la 3 (la coma se corre tres lugares a la derecha
        //float realFloat = 1.5e-10F; //la coma se corre 10 veces a la izquierda
        System.out.println("realFLoat = " + realFLoat);
        System.out.println("float corresponde en byte a " + Float.BYTES);
        System.out.println("float corresponde en bites a " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("mínimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4020235E38; //puedo poner una D al final pero al tener . ya es double por defecto
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a " + Double.BYTES);
        System.out.println("double corresponde en bites a " + Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("mínimo valor para double = " + Double.MIN_VALUE);
        
        float varFlotante = 3.1416F;
        System.out.println("varFlotante = " + varFlotante);

    }
    
}
