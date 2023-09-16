import java.util.Scanner;

public class SuperMercado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreProducto;
        int cantidadProducto, valDocenas, unidadesObsequio, cantDescuento;
        double precioProducto, montoCompra, montoDescuento, montoPagar;

        //Entrada
        System.out.println("Ingrese el nombre del producto");
        nombreProducto = entrada.nextLine();
        System.out.println("Ingrese la cantidad de productos: ");
        cantidadProducto = entrada.nextInt();
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = entrada.nextDouble();

        //Proceso
        valDocenas = cantidadProducto / 12;
        montoCompra = cantidadProducto * precioProducto;
        if(valDocenas >= 3){
            cantDescuento = 15;
            montoDescuento = montoCompra * 0.15;
            unidadesObsequio = valDocenas / 3;
        } else {
            cantDescuento = 10;
            montoDescuento = montoCompra * 0.10;
            unidadesObsequio = 0;
        }
        montoPagar = montoCompra - montoDescuento;

        //Salida
        System.out.println("Gracias por comprar, adjuntamos los detalles de su compra:");
        System.out.println("Monto de Compra: " + montoCompra);
        System.out.println("Descuento ("+ cantDescuento +"%): " + montoDescuento);
        System.out.println("Monto a pagar: " + montoPagar);
        System.out.println("Obtiene "+ unidadesObsequio + " " + nombreProducto + " de regalo");
    }
}
