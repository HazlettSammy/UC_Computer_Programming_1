import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get move choice from playerA
        System.out.println("Player A, enter your move (R for Rock, P for Paper, S for Scissors):");
        String playerAMove = scanner.nextLine().toUpperCase();
        if (!isValidMove(playerAMove)) {
            System.out.println("Invalid move! Please enter R, P, or S.");
            System.exit(0);
        }

        // Get move choice from playerB
        System.out.println("Player B, enter your move (R for Rock, P for Paper, S for Scissors):");
        String playerBMove = scanner.nextLine().toUpperCase();
        if (!isValidMove(playerBMove)) {
            System.out.println("Invalid move! Please enter R, P, or S.");
            System.exit(0);
        }

        // Display results
        System.out.println("Player A chose: " + playerAMove);
        System.out.println("Player B chose: " + playerBMove);
        System.out.println("Result: " + determineWinner(playerAMove, playerBMove));
    }

    // Method to check if the move is valid
    public static boolean isValidMove(String move) {
        return move.equals("R") || move.equals("P") || move.equals("S");
    }

    // Method to determine the winner
    public static String determineWinner(String playerAMove, String playerBMove) {
        if (playerAMove.equals(playerBMove)) {
            return "It's a Tie!";
        } else if ((playerAMove.equals("R") && playerBMove.equals("S")) ||
                (playerAMove.equals("P") && playerBMove.equals("R")) ||
                (playerAMove.equals("S") && playerBMove.equals("P"))) {
            return "Player A wins!";
        } else {
            return "Player B wins!";
        }
    }
}
