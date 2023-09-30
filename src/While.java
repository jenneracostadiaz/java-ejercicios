import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        boolean bandera;
        Scanner teclado = new Scanner(System.in);
        String nombre, apellido, opcion, usuarioMayorSalario = "", usuarioMenorSalario = "";
        double salario, suma = 0, promedio, mayorSalario = 0, menorSalario = Double.MAX_VALUE;
        int counter = 0;

        bandera = true;

        while ( bandera ) {
            System.out.println("Ingresar Nombre del Empleado");
            nombre = teclado.nextLine();

            System.out.println("Ingresar Apellido del Empleado");
            apellido = teclado.nextLine();

            System.out.println("Ingresar Sueldo del Empleado");
            salario = teclado.nextDouble();
            teclado.nextLine();
            suma = suma + salario;
            counter++;

            if(salario >= mayorSalario){
                mayorSalario = salario;
                usuarioMayorSalario = nombre + " " + apellido;
            }

            if(salario <= menorSalario){
                menorSalario = salario;
                usuarioMenorSalario = nombre + " " + apellido;
            }

            System.out.println("Desea ingresar datos otra vez? Si(S) / No(N)");
            opcion = teclado.nextLine();

            if(opcion.equals("N")){
                bandera = false;
            }

        }

        promedio = suma / counter;
        System.out.println("promedio = " + promedio);

        System.out.println("El mayor Salario es: "+ mayorSalario + " que pertenece a: "+usuarioMayorSalario);
        System.out.println("El menor Salario es: "+ menorSalario + " que pertenece a: "+usuarioMenorSalario);
    }
}
