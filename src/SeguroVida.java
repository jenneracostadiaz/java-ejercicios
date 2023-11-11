import java.util.Scanner;

public class SeguroVida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personas;
        double monto;
        System.out.print("Ingrese el número de personas: ");
        personas = sc.nextInt();
        System.out.print("Ingrese el tipo de seguro (Vida, Accidente, Salud): ");
        String tipo = sc.next();
        switch (tipo) {
            case "Vida":
                monto = personas * 40;
                break;
            case "Accidente":
                monto = personas * 30;
                break;
            case "Salud":
                monto = personas * 20;
                break;
            default:
                System.out.println("Tipo no valido");
                return;
        }
        if (personas > 5) {
            monto = monto * 1.08;
        }
        System.out.println("El monto a pagar es: " + monto);

    }
}
