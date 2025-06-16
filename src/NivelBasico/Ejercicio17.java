package NivelBasico;

import java.util.Scanner;

//17. Validar si un año es bisiesto.
public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un año para saber si es bisiesto o no:");
        int anio = scanner.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }

        scanner.close();
    }


}
