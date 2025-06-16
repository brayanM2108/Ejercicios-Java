package NivelBasico;

import java.util.Scanner;

//12. Generar los primeros N números pares.
public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números pares que quieres: ");
        int numero = scanner.nextInt();

        for (int i = 0; i <numero ; i++) {
            int sumador = i *2;
            System.out.println(sumador);

        }
        scanner.close();
    }
}
