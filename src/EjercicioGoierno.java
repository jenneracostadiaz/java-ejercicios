import java.util.Scanner;

public class EjercicioGoierno {
    public static void main(String[] args) {
        //Declaración de variables
        Scanner teclado = new Scanner(System.in);
        char sexo;
        String sector;
        
        //ENTRADA
        System.out.println("Ingresar Sexo del empleado masculino(M) / femenino(F)");
        sexo = teclado.next().charAt(0);
        teclado.nextLine();
        
        System.out.println("Ingresar sector SALUD/EDUCACION/TRANSPORTE");
        sector = teclado.nextLine();

        double random = Math.random();
        System.out.println("random = " + random);

        //PROCESO
        if(sexo == 'M'){
            if(sector.equals("SALUD")){
                System.out.println("Hola");
            }
        }
        //SALIDA

    }
}
