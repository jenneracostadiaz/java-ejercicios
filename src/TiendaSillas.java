import java.util.Scanner;

public class TiendaSillas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sillasCompradas;
        double precioSilla = 0;
        double totalPagar = 0;

        System.out.println("Ingrese el número de sillas compradas: ");
        sillasCompradas = scanner.nextInt();

        if (sillasCompradas > 8) {
            precioSilla = 10;
        } else if (sillasCompradas >= 4 && sillasCompradas <= 8) {
            precioSilla = 11;
        } else {
            precioSilla = 15;
        }

        totalPagar = sillasCompradas * precioSilla;

        System.out.println("El número de sillas compradas es: " + sillasCompradas);

        System.out.println("El precio por silla es: " + precioSilla);

        System.out.println("El total a pagar es: " + totalPagar);

    }
}
