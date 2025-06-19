package NivelBasico;

import java.util.Scanner;

//20. Ordenar tres números ingresados manualmente (sin arrays).
public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double b = scanner.nextDouble();
        System.out.print("Ingresa el tercer número: ");
        double c = scanner.nextDouble();


        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            double temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            double temp = b;
            b = c;
            c = temp;
        }


        System.out.println("Los números ordenados son: " + a + ", " + b + ", " + c);
        scanner.close();

    }
}

