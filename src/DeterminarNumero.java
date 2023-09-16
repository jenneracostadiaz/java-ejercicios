import java.util.Scanner;

public class DeterminarNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        //Entrada
        System.out.println("Ingrese un número: ");
        numero = entrada.nextInt();

        //Proceso
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
    }
}
