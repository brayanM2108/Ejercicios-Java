package NivelBasico;

import java.util.Scanner;

//18. Convertir temperaturas entre °C y °F.
public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 1 && opcion != 2){
            System.out.println("Que conversión desea realizar:");
            System.out.println("1.De grados Celsius (°C) a Fahrenheit (°F).\n" +
                    "2.De grados Fahrenheit (°F) a Celsius (°C).");

            opcion = scanner.nextInt();

            if (opcion != 1 && opcion != 2){
                System.out.println("Opción inválida. Intenta de nuevo.");
            }

    }
        System.out.println("Ingresa la temperatura: ");
        double temperatura = scanner.nextInt();

        if (opcion == 1){
            double conversionF = (temperatura * 9 / 5) + 32;
            System.out.println("La temperatura en grados Fahrenheit es: " + conversionF);
        }else {
            double conversionC = (temperatura - 32) * 5 / 9;
            System.out.println("La temperatura en grados Celsius es: " + conversionC);
        }
        scanner.close();
    }
}
