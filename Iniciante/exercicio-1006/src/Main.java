import java.io.IOException;
import java.util.Scanner;


/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner valor = new Scanner(System.in);

        double A;
        double B;
        double C;
        double pesoA = 2;
        double pesoB = 3;
        double pesoC = 5;

        A = valor.nextDouble();
        B = valor.nextDouble();
        C = valor.nextDouble();

        double media = ((A * pesoA) + (B * pesoB) + (C * pesoC)) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f%n", (media));


    }

}