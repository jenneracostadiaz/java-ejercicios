public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10, 20);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        rectangulo.calcularDiagonal();

        Triangulo triangulo = new Triangulo(6, 9);
        triangulo.calcularArea();
        triangulo.calcularAltura();

        Trapecio trapecio = new Trapecio(10, 20, 5);
        trapecio.calcularArea();
    }
}