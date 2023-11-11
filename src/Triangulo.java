public class Triangulo {
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    public void calcularAltura() {
        double altura = (Math.sqrt(3) / 2) * base;
        System.out.println("La altura del triángulo es: " + altura);
    }
}
