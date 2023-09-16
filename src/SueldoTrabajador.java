import java.util.Scanner;

public class SueldoTrabajador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String claseTrabajador;
        double horasTrabajadas, sueldo;

        //Entrada
        System.out.println("Ingrese clase de trabajador A/B/C: ");
        claseTrabajador = entrada.nextLine();

        System.out.println("Ingrese horas trabajadas: ");
        horasTrabajadas = entrada.nextDouble();

        //Proceso
        if (claseTrabajador.equals("A")) {
            sueldo = horasTrabajadas * 7;
        } else if (claseTrabajador.equals("B")) {
            sueldo = horasTrabajadas * 5;
        } else {
            sueldo = horasTrabajadas * 3.5;
        }

        //Salida
        System.out.println("El sueldo del trabajador es: S/." + sueldo);
    }
}
