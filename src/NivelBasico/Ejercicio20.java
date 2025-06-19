package NivelBasico;

import java.util.Scanner;

//20. Ordenar tres números ingresados manualmente (sin arrays).
public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa 3 números para ordenarlos: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int menor = 0, mayor = 0, medio = 0;
        if (a <= b && b <= c){
            menor = a;
            medio = b;
            mayor = c;
        } else if (a <= c && c <=b) {
            mayor = b;
            medio = c;
            menor = a;
        } else if (b <= a && a <= c) {
            mayor = c;
            medio = b;
            menor = a;
        } else if (c <= a && a <= b) {
            mayor = b;
            medio = a;
            menor = c;
        }else if (b <= c && c <= a) {
            mayor = a;
            medio = c;
            menor = b;
        }else if (c <= b && b <= a) {
            mayor = a;
            medio = b;
            menor = c;
        }
        System.out.println("Orden descendente:");
        System.out.println(mayor);
        System.out.println(medio);
        System.out.println(menor);
    }
}
