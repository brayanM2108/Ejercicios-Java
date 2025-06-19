package NivelIntermedio;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra1 = scanner.nextLine().toLowerCase();
        System.out.print("Ingrese otra palabra: ");
        String palabra2 = scanner.nextLine().toLowerCase();
        System.out.println("¿Es un anagrama válido? " + funcionAnagrama(palabra1, palabra2));



    }

    public static boolean funcionAnagrama (String palabra1, String palabra2){
        if (palabra1.equals(palabra2) || palabra1.length() != palabra2.length()){
            return false;
        }
        char [] char1 = palabra1.toCharArray();
        char [] char2 = palabra2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
}
