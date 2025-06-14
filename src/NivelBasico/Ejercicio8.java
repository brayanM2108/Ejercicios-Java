package NivelBasico;

//8. Imprimir los primeros N términos de Fibonacci.
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        long a = 0;
        long b = 1;
        for (int i = 0; i < numero; i++) {
            b += a;
            a = b - a;
            System.out.println(a);
        }
        scanner.close();
    }
}
