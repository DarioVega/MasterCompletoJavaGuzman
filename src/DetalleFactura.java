package src;

import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el servicio a pagar: ");
        String servicio = sc.nextLine();

        System.out.println("Ingrese el monto a pagar: ");
        double monto = sc.nextDouble();

        System.out.println("Usted va a pagar la factura del servicio: " + servicio + "\nEl monto de la factura es: " + monto);
    }
}
