package NivelBasico;

import java.util.Scanner;

//11. Verificar si una palabra es palíndromo.
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra:");
        String palabra = scanner.nextLine().toLowerCase();
        String cadenaInvertida = "";
        for (int i = palabra.length()-1; i>=0; i--) {
            char letra = palabra.charAt(i);
            cadenaInvertida += letra;
        }
            if (palabra.equals(cadenaInvertida.toLowerCase())){
                System.out.println("La palabra " + palabra + " es palíndroma");
            }else System.out.println("La palabra " + palabra + " no es palíndroma");


        scanner.close();
    }


}
