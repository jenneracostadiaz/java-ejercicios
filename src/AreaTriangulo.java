import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura, resultado;

        System.out.println("Vamos a calcular es área de un triángulo");

        //Ingreso
        System.out.println("Ingrese la Base:");
        base = scanner.nextDouble();

        System.out.println("Ingrese la Altura:");
        altura = scanner.nextDouble();

        //Proceso
        resultado = (base * altura)/2;

        //Salida
        System.out.println("El área de tu triángulo es " + resultado + "m^2");

    }
}
