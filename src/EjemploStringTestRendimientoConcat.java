package src;

import org.w3c.dom.ls.LSOutput;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 500; i++){
//            c = c.concat(a).concat(b).concat("\n"); // 500 -> 1ms // Es el segundo método más rápido cuando son pocos
//            c += a + b + "\n"; // es el tercer método más rápido cuando son pocos y el segundo cuando son muchos.
              sb.append(a).append(b).append("\n"); // Es el método más rápido


        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
