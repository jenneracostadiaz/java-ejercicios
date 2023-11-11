import java.util.Scanner;

public class MontoAlquiler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int habitaciones;
        double monto;
        System.out.print("Ingrese el número de habitaciones: ");
        habitaciones = sc.nextInt();
        if (habitaciones >= 10) {
            monto = habitaciones * 50 + 15;
        } else {
            monto = habitaciones * 50 + 5;
        }
        System.out.println("El monto a pagar es: " + monto);

    }
}
