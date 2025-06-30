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


public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String word1 = scanner.nextLine().toLowerCase();
        System.out.print("Ingrese otra palabra: ");
        String word2 = scanner.nextLine().toLowerCase();
        System.out.println("¿Es un anagrama válido? " + functionAnagrama(word1, word2));

    }

    public static boolean functionAnagrama (String word1, String word2){
        if (word1.equals(word2) || word1.length() != word2.length()){
            return false;
        }
        char [] char1 = word1.toCharArray();
        char [] char2 = word2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
}
