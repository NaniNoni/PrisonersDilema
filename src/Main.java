import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Bob");
        Player player2 = new Player("John");

        Scanner scanner = new Scanner(System.in);
        player1.getMove(scanner);
        player2.getMove(scanner);

        player1.updateScore(player2);
        System.out.println(player1.getScore());
        System.out.println(player2.getScore());
    }
}