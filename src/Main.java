import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombrePelicula = "Matrix";
        int fechaLanzamiento = 1992;
        double evaluacionUsuario = 0;
        int numEvaluaciones = 3;
        int contador = 0;
        System.out.println("SCREEN MATCH");
        System.out.println("Nombre de la pelicula: " + nombrePelicula);
        System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);

        while(contador < numEvaluaciones) {
            System.out.println("Ingresa la evaluación " + (contador+1) + "/" + numEvaluaciones + ":");
            evaluacionUsuario = evaluacionUsuario + leer.nextDouble();
            contador += 1;
        }

        System.out.println("La media de evaluaciones es: " + (evaluacionUsuario/numEvaluaciones));





    }
}