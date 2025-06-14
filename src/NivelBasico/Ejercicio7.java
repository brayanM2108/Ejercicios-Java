package NivelBasico;

import java.util.Scanner;

//7. Invertir una cadena manualmente.
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine().toLowerCase();
        String cadena = "";
        for (int i = frase.length()-1; i>=0; i--) {
            char letra = frase.charAt(i);
            cadena += letra;

        }
        System.out.println(cadena);

        scanner.close();
    }



}
