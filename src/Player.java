import java.util.Scanner;

public class Player {
    private final String name;
    private MoveType moveType;
    public int score = 0;

    public Player(String name) {
        this.name = name;
    }

    public MoveType inputMove(Scanner scanner) {
        System.out.print(name + "'s move: ");

        String input = scanner.nextLine();

        moveType = switch (input.trim().toLowerCase()) {
            case "cooperate" -> MoveType.Cooperate;
            case "defect" -> MoveType.Defect;

            default -> {
                System.out.println("Please enter a valid move (cooperate/defect)");
                yield inputMove(scanner);
            }
        };

        return moveType;
    }

    public MoveType getMove() {
        return moveType;
    }

    public int getScore() {
        return score;
    }
}
