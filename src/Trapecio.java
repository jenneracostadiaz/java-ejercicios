public class Trapecio {
    double baseMayor;
    double baseMenor;
    double altura;

    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public void calcularArea() {
        double area = ((baseMayor + baseMenor) * altura) / 2;
        System.out.println("El área del trapecio es: " + area);
    }


}
