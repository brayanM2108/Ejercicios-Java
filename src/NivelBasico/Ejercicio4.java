package NivelBasico;
//4. Dado un número entero positivo, suma todos sus dígitos y muestra el resultado.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt(); // Lee un número entero

        int sumaNumeros = 0;

        while(numero > 0){
            sumaNumeros += numero % 10;// extrae el último dígito
            numero = numero / 10;

        }
        System.out.println("la suma de números es " + sumaNumeros);
        scanner.close();
    }

}
