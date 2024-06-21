import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        playTicTacToe();
    }

    private static void playTicTacToe() {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        boolean playAgain = true;

        while (playAgain) {
            game.displayBoard();
            char currentPlayer = 'X';

            while (true) {
                int row = SafeInput.getRangedInt(scanner, "Enter row", 0, 2);
                int col = SafeInput.getRangedInt(scanner, "Enter column", 0, 2);

                if (game.makeMove(row, col, currentPlayer)) {
                    game.displayBoard();
                    if (game.checkWin(currentPlayer)) {
                        System.out.println("Player " + currentPlayer + " wins!");
                        break;
                    }
                    if (game.checkDraw()) {
                        System.out.println("It's a draw!");
                        break;
                    }
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            }

            playAgain = SafeInput.getYNConfirm(scanner, "Do you want to play again? (Y/N)");
            if (playAgain) {
                game.resetBoard();
            }
        }

        scanner.close();
    }
}
