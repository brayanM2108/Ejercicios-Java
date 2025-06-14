package NivelBasico;
//1.Números pares e impares: Imprimir los números del 1 al 100 e indicar si son pares o impares.

public class Ejercicio1 {
    public static void main(String[] args) {

        for(int numero = 0; numero <= 100; numero++){
            if(numero % 2 == 0){
                System.out.println("el numero es par: " + numero);
            }else {
                System.out.println("el numero es impar: " + numero);
            }
        }
    }
}
