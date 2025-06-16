package NivelBasico;

import java.util.Scanner;

//14. Dibujar un triángulo o pirámide con `*` en consola.
public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige la altura del triangulo: ");

        int altura = scanner.nextInt();

        for (int i = 0; i <= altura ; i++) {
            int aux = altura - i;
            int aux2 = i - 1;
            System.out.println(' ');

            for (int k = 0; k <aux; k++) {
                System.out.print(' ');
            }

            for (int j = 0; j <= aux2; j++) {
                System.out.print('*');
                System.out.print(' ');

            }


        }
        scanner.close();
    }
}
