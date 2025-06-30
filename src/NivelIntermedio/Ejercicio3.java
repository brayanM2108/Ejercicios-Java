package NivelIntermedio;

/*
 * Crea un programa que sea capaz de transformar texto natural a código
 * morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar
 *   la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
 *   o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en
 *   https://es.wikipedia.org/wiki/Código_morse.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el texto a convertir: ");
        String text = scanner.nextLine().toUpperCase();
        System.out.println("cadena:" + functionMorse(text));
        scanner.close();
    }

    public static StringBuilder functionMorse(String words) {

        Map<String, String> naturalDict = Map.ofEntries(
                Map.entry("A", ".—"), Map.entry("B", "—..."), Map.entry("C", "—.—."),
                Map.entry("CH", "————"), Map.entry("D", "—.."), Map.entry("E", "."),
                Map.entry("F", "..—."), Map.entry("G", "——."), Map.entry("H", "...."),
                Map.entry("I", ".."), Map.entry("J", ".———"), Map.entry("K", "—.—"),
                Map.entry("L", ".—.."), Map.entry("M", "——"), Map.entry("N", "—."),
                Map.entry("Ñ", "——.——"), Map.entry("O", "———"), Map.entry("P", ".——."),
                Map.entry("Q", "——.—"), Map.entry("R", ".—."), Map.entry("S", "..."),
                Map.entry("T", "—"), Map.entry("U", "..—"), Map.entry("V", "...—"),
                Map.entry("W", ".——"), Map.entry("X", "—..—"), Map.entry("Y", "—.——"),
                Map.entry("Z", "——.."), Map.entry("0", "—————"), Map.entry("1", ".————"),
                Map.entry("2", "..———"), Map.entry("3", "...——"), Map.entry("4", "....—"),
                Map.entry("5", "....."), Map.entry("6", "—...."), Map.entry("7", "——..."),
                Map.entry("8", "———.."), Map.entry("9", "————."), Map.entry(".", ".—.—.—"),
                Map.entry(",", "——..——"), Map.entry("?", "..——.."), Map.entry("\"", ".—..—."),
                Map.entry("/", "—..—"));

        Map<String, String> morseToNatural = new HashMap<>();
        for (Map.Entry<String, String> entry : naturalDict.entrySet()) {
            morseToNatural.put(entry.getValue(), entry.getKey());
        }

        StringBuilder textDecodified = new StringBuilder();

        if (words.matches("[a-zA-Z0-9 ]+")) {

            for (int i = 0; i < words.length(); i++) {

                //Si es un espacio
                if (words.charAt(i) == ' ') {
                    textDecodified.append(" ");
                    continue;
                }
                //Si hay un CH
                if (words.charAt(i) == 'C' && i + 1 < words.length()
                        && words.charAt(i + 1) == 'H') {

                    String ch = "CH";
                    if (naturalDict.containsKey(ch)) {
                        textDecodified.append(naturalDict.get(ch)).append(" ");
                    }
                    i++;
                    continue;

                }

                //Cualquier letra o numero
                String letter = String.valueOf(words.charAt(i));
                if (naturalDict.containsKey(letter)) {
                    textDecodified.append(naturalDict.get(letter)).append(" ");
                }

            }

        } else if (words.contains(".") || words.contains("—")) {
            //separar las palabras por doble espacio
            String[] wordArray = words.split(" {2}");

            //separa los símbolos
            for (String word : wordArray) {
                String[] symbols = word.split(" ");

                //si encuentra el símbolo en el mapa lo agrega al StringBuilder
                for (String s : symbols) {
                    if (morseToNatural.containsKey(s)) {
                        textDecodified.append(morseToNatural.get(s));
                    }
                }
                textDecodified.append(" ");

            }

        }

        return textDecodified;
    }

}