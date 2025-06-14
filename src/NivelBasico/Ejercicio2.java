package NivelBasico;
import java.util.Scanner;
//2. Imprimir la Tabla de multiplicar de un número ingresado.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt(); // Lee un número entero

        for (int i = 1; i <= 10; i++) {
          int multiplicador = numero * i;
            System.out.println(numero + " "+ "*" + i + " = " + multiplicador);
        }

        scanner.close();
    }
}
