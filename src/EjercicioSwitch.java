import java.util.Scanner;

public class EjercicioSwitch {
    public static void main(String[] args) {

        //Declaración de variables
        Scanner teclado = new Scanner(System.in);
        int puntaje;
        String mensaje = "";

        //ENTRADA
        System.out.println("Ingresar Puntaje 0/05/10/15/20:");
        puntaje = teclado.nextInt();

        //PROCESO
        switch (puntaje){
            case 0:
                mensaje = "DESCARTADO";
                break;
            case 5:
                mensaje = "SUSPENSO";
                break;
            case 10:
                mensaje = "ACEPTABLE";
                break;
            case 15:
                mensaje = "NOTABLE";
                break;
            case 20:
                mensaje = "SOBRESALIENTE";
                break;
            default:
                mensaje = "Prueba con otro número";
        }

        //SALIDA
        System.out.println("mensaje = " + mensaje);
    }
}
