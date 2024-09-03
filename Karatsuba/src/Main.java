
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número binário: ");
        String binario1 = scanner.nextLine();

        System.out.print("Digite o segundo número binário: ");
        String binario2 = scanner.nextLine();


        System.out.println("Algoritmo de Karatsuba:");
        Karatsuba karatsuba = new Karatsuba();
        String resultado = karatsuba.multiplicar(binario1, binario2);
        System.out.println("Resultado binário: " + resultado);

    }
}