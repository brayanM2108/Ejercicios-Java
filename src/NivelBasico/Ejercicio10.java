package NivelBasico;

import java.util.Scanner;

//10. Adivina el número aleatorio del 1 al 100.
public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int intentos = 0;
        int dificultad = 0;

        while (dificultad != 1 && dificultad != 2 && dificultad != 3) {
            System.out.println("Elige la dificultad del juego:");
            System.out.println("""
            1.FACIL: 20 INTENTOS
            2.NORMAL: 15 INTENTOS
            3.DIFICIL: 10 INTENTOS""");

            dificultad = scanner.nextInt();

            if (dificultad == 1) {
                intentos = 20;
            } else if (dificultad == 2) {
                intentos = 15;
            } else if (dificultad == 3) {
                intentos = 10;
            } else {
                System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }


        int numeroAleatorio = (int) (Math.random() * 100) + 1; // Número entre 1 y 100

        boolean juegoGanado = false;
        for (int i = 0; i < intentos; i++) {
            System.out.println("Ingresa un número: ");
            int numeroJugador = scanner.nextInt();
            if (numeroJugador == numeroAleatorio) {
                System.out.println("Ganaste!");
                juegoGanado = true;
                break;
            }
            if (numeroJugador != numeroAleatorio){
                if (numeroJugador < numeroAleatorio){
                    System.out.println("el numero es mayor");
                }else System.out.println("el número es menor");
            }

        }
        if (!juegoGanado){
            System.out.println("Perdiste, ya no tienes más intentos " + "El número era " + numeroAleatorio);
        }

        scanner.close();


    }
}




