import java.util.Scanner;

public class CantidadPasajeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cantidad;
        int pasajeros;
        int turno;
        int totalMañana = 0;
        int totalTarde = 0;
        int totalNoche = 0;
        int totalOmibus = 0;
        int totalMinivan = 0;
        int totalCombi = 0;
        System.out.print("Ingrese la cantidad de vehículos: ");
        cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el tipo de vehículo (1: Ómnibus, 2: Minivan, 3: Combi): ");
            int tipo = sc.nextInt();
            System.out.print("Ingrese la cantidad de pasajeros: ");
            pasajeros = sc.nextInt();
            System.out.print("Ingrese el turno (1: Mañana, 2: Tarde, 3: Noche): ");
            turno = sc.nextInt();
            switch (tipo) {
                case 1:
                    totalOmibus = totalOmibus + pasajeros;
                    break;
                case 2:
                    totalMinivan = totalMinivan + pasajeros;
                    break;
                case 3:
                    totalCombi = totalCombi + pasajeros;
                    break;
                default:
                    System.out.println("Tipo de vehículo no válido");
                    return;
            }
            switch (turno) {
                case 1:
                    totalMañana = totalMañana + pasajeros;
                    break;
                case 2:
                    totalTarde = totalTarde + pasajeros;
                    break;
                case 3:
                    totalNoche = totalNoche + pasajeros;
                    break;
                default:
                    System.out.println("Turno no válido");
                    return;
            }
        }
        System.out.println("El total de pasajeros en la mañana es: " + totalMañana);
        System.out.println("El total de pasajeros en la tarde es: " + totalTarde);
        System.out.println("El total de pasajeros en la noche es: " + totalNoche);
        System.out.println("El total de pasajeros en ómnibus es: " + totalOmibus);
        System.out.println("El total de pasajeros en minivan es: " + totalMinivan);
        System.out.println("El total de pasajeros en combi es: " + totalCombi);

    }
}
