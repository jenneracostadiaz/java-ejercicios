import java.util.Scanner;

public class CompraPolos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        double precio;
        double monto;
        double igv;
        System.out.print("Ingrese la cantidad de polos: ");
        cantidad = sc.nextInt();
        System.out.print("Ingrese la talla del polo: ");
        String talla = sc.next();
        switch (talla) {
            case "Small":
                precio = 20;
                break;
            case "Medium":
                precio = 40;
                break;
            case "Large":
                precio = 50;
                break;
            case "Extra Large":
                precio = 60;
                break;
            default:
                System.out.println("Talla no valida");
                return;
        }
        monto = cantidad * precio;
        igv = monto * 0.18;
        System.out.println("El monto a pagar es: " + (monto + igv));

    }
}
