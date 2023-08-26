import java.util.Scanner;

public class BoletaCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre, producto1, producto2;
        int cantidad1, cantidad2;
        double precio1, precio2, total, precioProd1, precioProd2;

        //ENTRADA
        System.out.println("Ingrese su Nombre:");
        nombre = scanner.nextLine();
        System.out.println("Datos del 1er Producto");
        System.out.println("Ingrese el nombre producto");
        producto1 = scanner.nextLine();
        System.out.println("Ingrese el precio");
        precio1 = scanner.nextDouble();
        System.out.println("Ingrese la cantidad");
        cantidad1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Datos del 2do Producto");
        System.out.println("Ingrese el nombre producto");
        producto2 = scanner.nextLine();
        System.out.println("Ingrese el precio");
        precio2 = scanner.nextDouble();
        System.out.println("Ingrese la cantidad");
        cantidad2 = scanner.nextInt();

        //PROCESO
        precioProd1 = cantidad1 * precio1;
        precioProd2 = cantidad2 * precio2;
        total = precioProd1 + precioProd2;

        //SALIDA
        System.out.println("###########");
        System.out.println("TIENDA ABC");
        System.out.println("###########");
        System.out.println("ID: 0000252145");
        System.out.println(" ");
        System.out.println("COMPRAS");
        System.out.println("AV. SAENS PEÑA 376");
        System.out.println("CHICLAYO");
        System.out.println("LOTE: B   TERM:5268");
        System.out.println("###################");
        System.out.println("FECHA: 07MAR22   HORA: 15:35");
        System.out.println("VEND: JUAN       CLI: "+nombre);
        System.out.println("############################");
        System.out.println(cantidad1+" "+producto1+" ("+precio1+")");
        System.out.println(" ");
        System.out.println(cantidad2+" "+producto2+" ("+precio2+")");
        System.out.println(" ");
        System.out.println("PAGO TOTAL: S/." + total);
        System.out.println(" ");
        System.out.println("###################");
        System.out.println("VUELVA PRONTO!");
        System.out.println("###################");
    }
}
