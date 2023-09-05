import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;

        //Entrada
        System.out.println("Ingrese la nota del alumno:");
        nota = teclado.nextInt();

        //Proceso
        if (nota > 18 && nota <= 20){
            System.out.println("Excelente");
        }

        if (nota > 15 && nota <= 18){
            System.out.println("Bueno");
        }

        if (nota > 13 && nota <= 15){
            System.out.println("Regular");
        }

        if (nota < 13 && nota >= 0){
            System.out.println("Malo");
        }

    }
}
