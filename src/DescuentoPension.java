import java.util.Scanner;

public class DescuentoPension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double promedio;
        double descuento;
        System.out.print("Ingrese el promedio del alumno: ");
        promedio = sc.nextDouble();
        if (promedio >= 15) {
            descuento = 20;
        } else if (promedio >= 12) {
            descuento = 10;
        } else {
            descuento = 0;
        }
        System.out.println("El descuento es: " + descuento + "%");

    }
}
