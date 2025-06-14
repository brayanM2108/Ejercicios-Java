package NivelBasico;

import java.util.Scanner;

//9. Calculadora básica con `switch`.
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que operación desea realizar:");
        System.out.println("1.Suma/ 2.Resta/ 3.Multiplicación/ 4.División");
        int opcion = scanner.nextInt();
        if (opcion < 1 || opcion > 4) {
            System.out.println("ingrese una opción valida");
        } else {
            System.out.print("Ingrese el primer número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int numero2 = scanner.nextInt();


            switch (opcion) {

                case 1:
                    int resultadoSuma = numero1 + numero2;
                    System.out.println("resultado: " + resultadoSuma);
                    break;
                case 2:
                    int resultadoResta = numero1 - numero2;
                    System.out.println("resultado: " + resultadoResta);
                    break;
                case 3:
                    int resultadoMultiplicacion = numero1 * numero2;
                    System.out.println("resultado: " + resultadoMultiplicacion);
                    break;
                case 4:
                    if (numero2 != 0) {
                        int resultadoDivision = numero1 / numero2;
                        System.out.println("resultado: " + resultadoDivision);
                    }
                    break;
                default:
                    System.out.println("Opción no valida");

            }
        }
        scanner.close();
    }
}
