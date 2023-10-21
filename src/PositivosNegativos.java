import java.util.Scanner;

public class PositivosNegativos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cantidad;
        int numero;
        int sumaNegativos = 0;
        int productoPositivos = 1;
        int ceros = 0;
        System.out.print("Ingrese la cantidad de números: ");
        cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número: ");
            numero = sc.nextInt();
            if (numero < 0) {
                sumaNegativos = sumaNegativos + numero;
            } else if (numero > 0) {
                productoPositivos = productoPositivos * numero;
            } else {
                ceros++;
            }
        }
        System.out.println("La suma de los negativos es: " + sumaNegativos);
        System.out.println("El producto de los positivos es: " + productoPositivos);
        System.out.println("El porcentaje de ceros es: " + (ceros * 100 / cantidad) + "%");

    }
}
