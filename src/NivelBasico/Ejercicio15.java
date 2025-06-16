package NivelBasico;

import java.util.Scanner;

//15. Sumar todos los números pares en un rango.
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número inicial del rango:");
        int rangoInicial = scanner.nextInt();
        System.out.println("Ingrese el número final del rango:");
        int rangoFinal = scanner.nextInt();


        int aux = 0;
        for (int i = rangoInicial ; i <=rangoFinal; i++) {
            if (i % 2 == 0){
               aux += i;
            }

        }
        System.out.println("La suma de los números pares desde " + rangoInicial + " hasta " + rangoFinal + " es:");
        System.out.println(aux);
        scanner.close();
    }
}
