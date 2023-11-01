import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

                int a; // Código de Produtos
                int b; // Quantidade
                double valor; // Valor produto
                double soma;

                Scanner scanner = new Scanner(System.in);

                // Produto 1
                a = scanner.nextInt();
                b = scanner.nextInt();
                valor = scanner.nextDouble();
                soma = valor * b;

                // Produto 2
                a = scanner.nextInt();
                b = scanner.nextInt();
                valor = scanner.nextDouble();
                soma += valor * b;

                System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);




    }
}