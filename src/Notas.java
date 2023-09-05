import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        String mensaje = "";

        //Entrada
        System.out.println("Ingrese la nota del alumno:");
        nota = teclado.nextInt();

        //Proceso
        if (nota > 18 && nota <= 20){
            mensaje = "Excelente";
        }

        if (nota > 15 && nota <= 18){
            mensaje = "Bueno";
        }

        if (nota > 13 && nota <= 15){
            mensaje = "Regular";
        }

        if (nota < 13 && nota >= 0){
            mensaje = "Malo";
        }

        System.out.println("mensaje = " + mensaje);

    }
}
