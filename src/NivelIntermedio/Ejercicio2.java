package NivelIntermedio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un texto: ");
        String text = scanner.nextLine().toLowerCase().replaceAll("\\p{Punct}" , "");
        String[] words = text.split(" ");

        System.out.println("Repeticiones de palabras: \n"  + countWords(words));

    }
    public static StringBuilder countWords (String[]words){
        Map<String, Integer> counter = new HashMap<>();

        for (String word : words) {
            counter.put(word, counter.getOrDefault(word, 0) + 1);

        }
        StringBuilder counterWords = new StringBuilder();
        for (HashMap.Entry<String, Integer> entry : counter.entrySet()) {
            counterWords.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");

        }
        return counterWords;
    }

}
