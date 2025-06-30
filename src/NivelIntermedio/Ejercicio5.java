package NivelIntermedio;

/*
 * Crea un programa que calcule quien gana más partidas al piedra,
 * papel, tijera.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "R" (piedra), "P" (papel)
 *   o "S" (tijera).
 * - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        String[][] plays = {{"R", "R"}, {"P", "R"}, {"S", "R"}};
        String resultado = calculateWinner(plays);
        System.out.println("El ganador es: " + resultado);

    }

    public static String calculateWinner(String[][] plays) {
        int player1 = 0;
        int player2 = 0;

        for (String[] play : plays) {
            if (!play[0].equals(play[1])) {

                if (play[0].equals("R") && play[1].equals("S")
                        || play[0].equals("S") && play[1].equals("P")
                        || play[0].equals("P") && play[1].equals("R")) {
                    player1++;
                } else player2++;
            }
        }
        return player1 == player2 ? "Tie" : (Math.max(player1, player2) == player1 ? "Player 1" : "Player 2");

    }
}