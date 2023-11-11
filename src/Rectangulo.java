public class Rectangulo {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }

    public void calcularPerimetro() {
        double perimetro = 2 * (base + altura);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }

    public void calcularDiagonal() {
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        System.out.println("La diagonal del rectángulo es: " + diagonal);
    }
}
