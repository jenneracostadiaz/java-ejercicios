import java.util.Scanner;

public class MontoPagar {
    public static void main(String[] args) {
        double monto, igv, total;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a su calculadora");
        //Ingreso
        System.out.println("Ingrese el total de su compra");
        monto = scanner.nextDouble();

        //Proceso
        igv = monto * 0.18;
        total = monto + igv;

        //Salida
        System.out.println("Monto de compra: " + monto);
        System.out.println("IGV de compra: " + igv);
        System.out.println("Total de compra: " + total);
    }
}
