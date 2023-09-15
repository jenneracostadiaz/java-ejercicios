import java.util.Scanner;

public class AreaTrapecio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double area, baseMayor, baseMenor, altura;

        //Entrada
        System.out.println("Ingrese la base mayor del trapecio: ");
        baseMayor = entrada.nextDouble();

        System.out.println("Ingrese la base menor del trapecio: ");
        baseMenor = entrada.nextDouble();

        System.out.println("Ingrese la altura del trapecio: ");
        altura = entrada.nextDouble();

        //Proceso
        area = ((baseMayor + baseMenor) * altura) / 2;

        //Salida
        System.out.println("El área del trapecio es: " + area);
    }
}
