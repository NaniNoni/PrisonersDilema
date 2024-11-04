import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Bob");
        Player player2 = new Player("John");

        Scanner scanner = new Scanner(System.in);
        player1.inputMove(scanner);
        player2.inputMove(scanner);

        updateScores(player1, player2);
        System.out.println(player1.getScore());
        System.out.println(player2.getScore());
    }

    static void updateScores(Player player1, Player player2) {
        if (player1.getMove() == MoveType.Cooperate && player2.getMove() == MoveType.Cooperate) {
            player1.score += 3;
            player2.score += 3;
        } else if (player1.getMove() == MoveType.Defect && player2.getMove() == MoveType.Defect) {
            player1.score += 1;
            player2.score += 1;
        } else {
            if (player1.getMove() == MoveType.Defect) {
                player1.score += 5;
            }
            else {
                player2.score += 5;
            }
        }
    }
}