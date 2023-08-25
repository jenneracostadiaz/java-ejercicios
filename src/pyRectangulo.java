import java.util.Scanner;

public class pyRectangulo {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        String nombre;
        int h, b, area, perimetro;

        //ENTRADA
        System.out.println("Ingresar tu nombre:");
        nombre = ingreso .nextLine();
        System.out.println("Ingresar la altura del rectángulo:");
        h = ingreso.nextInt();
        System.out.println("Ingresar la base del rectángulo:");
        b = ingreso.nextInt();

        //PROCESO
        area = b * h;
        perimetro = b+b+h+h;

        //SALIDA
        System.out.println("Estimado:"+nombre+"las respuestas son:");
        System.out.println("El perímetro es: " + perimetro);
        System.out.println("El área es: = " + area);
    }
}
