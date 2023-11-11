import java.util.Scanner;

public class CompraAuto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int montoOriginal;
        double montoFinal;

        System.out.println("Ingrese el monto original: ");
        montoOriginal = scanner.nextInt();

        if (montoOriginal >= 5000) {
            montoFinal = montoOriginal + (montoOriginal * 0.08);
        } else {
            montoFinal = montoOriginal + (montoOriginal * 0.06);
        }
        System.out.println("El monto final a cancelar es: " + montoFinal);
    }
}
