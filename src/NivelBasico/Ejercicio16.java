package NivelBasico;

//16. Multiplicar todos los números de un array.
public class Ejercicio16 {
    public static void main(String[] args) {
        int [] numeros = {3,3, 5};


        int producto = 1;
        for (int numero : numeros) {

            producto *= numero;
            System.out.println(producto);
        }
        System.out.println(producto);

    }
}
