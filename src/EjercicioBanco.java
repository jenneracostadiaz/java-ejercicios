import java.util.Scanner;

public class EjercicioBanco {
    public static void main(String[] args) {
        //VARIABLES
        Scanner teclado = new Scanner(System.in);
        char tipoTarjeta;
        double deuda = 0, credito = 0, nuevoCredito = 0;

        //ENTRADA
        System.out.println("Ingresar tipo de tarjeta 1/2/3");
        tipoTarjeta = teclado.next().charAt(0);
        System.out.println("Ingresar deuda");
        deuda = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Ingresar la Línea de crédito");
        credito = teclado.nextDouble();

        //PROCESO
        switch (tipoTarjeta){
            case 1:
                System.out.println("Case 1");
                if(deuda == 0){
                    nuevoCredito = credito + 0.25 * credito;
                } else {
                    nuevoCredito = credito + 0.125 * credito;
                }
                break;
            case 2:
                if(deuda == 0){
                    nuevoCredito = credito+(credito * 0.35);
                } else {
                    nuevoCredito = credito + (credito * 0.175);
                }
                break;
            case 3:
                nuevoCredito = credito + (credito * 0.50);
                break;
        }

        //SALIDA
        System.out.println("nuevoCredito = " + nuevoCredito);
    }
}
