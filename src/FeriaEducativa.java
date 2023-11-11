import java.util.Scanner;

public class FeriaEducativa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edad;
        String sexo;
        String instruccion;
        int mayorEdad = 0;
        int sumaEdadesPrimaria = 0;
        int cantidadPrimaria = 0;
        int sumaEdadesSecundaria = 0;
        int cantidadSecundaria = 0;
        int sumaEdadesSuperior = 0;
        int cantidadSuperior = 0;
        int cantidad = 0;

        while (cantidad < 3) {
            System.out.print("Ingrese la edad: ");
            edad = sc.nextInt();
            if (edad == 0) {
                break;
            }
            System.out.print("Ingrese el sexo (M/F): ");
            sexo = sc.next();
            System.out.print("Ingrese el grado de instrucción (Primaria, Secundaria, Superior): ");
            instruccion = sc.next();
            if (edad > mayorEdad) {
                mayorEdad = edad;
            }
            if (instruccion.equals("Primaria")) {
                sumaEdadesPrimaria = sumaEdadesPrimaria + edad;
                cantidadPrimaria++;
            } else if (instruccion.equals("Secundaria")) {
                sumaEdadesSecundaria = sumaEdadesSecundaria + edad;
                cantidadSecundaria++;
            } else {
                sumaEdadesSuperior = sumaEdadesSuperior + edad;
                cantidadSuperior++;
            }
            cantidad++;
        }
        System.out.println("La mayor edad es: " + mayorEdad);
        if (cantidadPrimaria > 0) {
            System.out.println("El promedio de edades en las personas con instrucción Primaria es: " + (sumaEdadesPrimaria / cantidadPrimaria));
        }
        if (cantidadSecundaria > 0) {
            System.out.println("El promedio de edades en las personas con instrucción Secundaria es: " + (sumaEdadesSecundaria / cantidadSecundaria));
        }
        if (cantidadSuperior > 0) {
            System.out.println("El promedio de edades en las personas con instrucción Superior es: " + (sumaEdadesSuperior / cantidadSuperior));
        }

    }
}
