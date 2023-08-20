import java.util.Scanner;

public class FormulaMatematica {
    public static void main(String[] args) {
        double x, y, z, resultado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos a Resolver un poco de Matemáticas, la formula a resolver es x+4y*2+z-(3x/z)");
        //Ingreso
        System.out.println("Ingrese el valor de la variable x");
        x = scanner.nextDouble();

        System.out.println("Ingrese el valor de la variable y");
        y = scanner.nextDouble();

        System.out.println("Ingrese el valor de la variable z");
        z = scanner.nextDouble();

        //Proceso
        resultado = x+((4*y)*(2+z))-((3*x)/z);

        //Salida
        System.out.println("el Resultado para "+x+"+4"+y+"*2+"+z+"-(3*"+x+"/"+z+") = " + resultado);

    }
}
