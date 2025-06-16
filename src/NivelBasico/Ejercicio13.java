package NivelBasico;

import java.util.Scanner;

//13. Contar letras, espacios y símbolos en una cadena.
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String cadena = scanner.nextLine().toLowerCase();
        int numero;
        int letra = 0;
        int espacios = 0;
        int simbolos = 0;
        int numeros = 0;
        for (int i = 0; i <cadena.length() ; i++) {
            char caracter = cadena.charAt(i);
            boolean isChar1Letter = Character.isLetter(caracter);
            boolean isChar1number = Character.isDigit(caracter);
            if (isChar1Letter){
                letra ++;
            }else if (caracter == ' '){
                espacios++;
            } else if (isChar1number) {
                numeros++;
            } else simbolos ++;

        }
        scanner.close();
        numero = letra + espacios + simbolos + numeros;
        System.out.println("La cantidad de letras son: " + letra);
        System.out.println("La cantidad de espacios son: " + espacios);
        System.out.println("La cantidad de símbolos son: " + simbolos);
        System.out.println("La cantidad de números son: " + numeros);
        System.out.println("La cantidad de caracteres totales son: " + numero);
    }
}
