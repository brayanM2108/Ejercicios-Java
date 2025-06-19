package NivelBasico;
import java.util.Scanner;
public class Ejercicio21 {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Ingresar tres números
            System.out.print("Ingresa el primer número: ");
            double a = sc.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            double b = sc.nextDouble();
            System.out.print("Ingresa el tercer número: ");
            double c = sc.nextDouble();

            // Ordenar los números
            if (a > b) {
                double temp = a;
                a = b;
                b = temp;
            }
            if (a > c) {
                double temp = a;
                a = c;
                c = temp;
            }
            if (b > c) {
                double temp = b;
                b = c;
                c = temp;
            }

            // Mostrar el resultado
            System.out.println("Los números ordenados son: " + a + ", " + b + ", " + c);
        }
    }


