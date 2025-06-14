package NivelBasico;

import java.util.Scanner;

//6. Contar vocales en una frase.
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine().toLowerCase();
        int contador = 0;
        for (int i = 0; i < frase.length() ; i++){
            char letra = frase.charAt(i);
            for (char vocal : vocales) {
                if (letra == vocal) {
                    contador++;

                }
            }
            }

        System.out.println("La cantidad de vocales es: " + contador);
        scanner.close();
        }

    }




