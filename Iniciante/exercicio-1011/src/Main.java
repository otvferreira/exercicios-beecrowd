import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        double raio;
        double volume;
        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in);

        raio = scanner.nextDouble();
        raio = (raio*raio*raio);
        volume = (4.0/3) * pi * raio;

        System.out.printf("VOLUME = %.3f\n", volume);


    }
}