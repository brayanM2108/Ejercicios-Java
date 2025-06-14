package NivelBasico;
import java.util.Scanner;
//3. Verificar si un número es primo.

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt(); // Lee un número entero
        int contador = 0;
        for (int i = 1; i <=numero; i++){
            if(numero % i == 0){
                contador++;
            }
        }
        if (contador == 2){
            System.out.println("el numero " + numero + " es primo");
        }else System.out.println("el numero " + numero + " no es primo");
        scanner.close();
    }
}
