package NivelBasico;

import java.util.Scanner;

//5. Mostrar el mayor y menor de 5 números.
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 5 números");
        System.out.print("Numero 1: ");
        int mayor, menor;
        int numero = scanner.nextInt(); // Lee un número entero
        mayor = menor = numero;
        for (int i = 2; i <= 5; i++){
            System.out.println("Ingrese el número " + i);
            numero = scanner.nextInt();
            if (numero > mayor){
                mayor = numero;
            }
            if (numero < menor){
                menor = numero;
            }
        }
        scanner.close();
        System.out.println("El número mayor es " + mayor);
        System.out.println("El número menor es " + menor);
    }
}
