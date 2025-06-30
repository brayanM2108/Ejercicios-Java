package NivelIntermedio;

import java.util.Scanner;

/*
 * Crea dos funciones, una que calcule el máximo común divisor (MCD) y otra
 * que calcule el mínimo común múltiplo (mcm) de dos números enteros.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un número");
        int number1 = scanner.nextInt();
        System.out.println("ingrese otro número");
        int number2 = scanner.nextInt();
        System.out.println("el MCD de " + number1 + " y " + number2 + " es: " + calculateMcd(number1, number2));
        System.out.println("el MCD de " + number1 + " y " + number2 + " es: " + calculateMcm(number1, number2));
        scanner.close();
    }


    public static int calculateMcd(int number1, int number2) {
        int smaller = Math.min(number1, number2);
        int larger = Math.max(number1, number2);
        int remainder;

        while ((remainder = larger % smaller) != 0) {
            larger = smaller;
            smaller = remainder;
        }
        return smaller;
    }


    public static int calculateMcm(int number1, int number2){
        int mcd = calculateMcd(number1, number2);
        return number1 * number2 / mcd;
    }
}