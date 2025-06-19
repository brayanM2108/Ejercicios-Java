package NivelBasico;

import java.util.Scanner;

//19. Calcular el factorial de un número.
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para calcular su factorial:");
        int numero = scanner.nextInt();

        int aux = 1;
        for (int i = numero; i >= 2 ; i--) {
            aux *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + aux);

        scanner.close();
    }

}
