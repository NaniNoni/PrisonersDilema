import java.util.Scanner;

public class Player {
    private final String name;
    private MoveType moveType;
    public int score = 0;

    public Player(String name) {
        this.name = name;
    }

    MoveType getMove(Scanner scanner) {
        System.out.print(name + "'s move: ");

        String input = scanner.nextLine();

        moveType = switch (input.trim().toLowerCase()) {
            case "cooperate" -> MoveType.Cooperate;
            case "defect" -> MoveType.Defect;

            default -> getMove(scanner);
        };

        System.out.println();

        return moveType;
    }

    void updateScore(Player other) {
        if (moveType == MoveType.Cooperate && other.getMove() == MoveType.Cooperate) {
            score += 3;
            other.score += 3;
        } else if (moveType == MoveType.Defect && other.getMove() == MoveType.Defect) {
            score += 1;
            other.score += 1;
        } else {
            if (moveType == MoveType.Defect) {
                score += 5;
            }
        }
    }

    public MoveType getMove() {
        return moveType;
    }

    public int getScore() {
        return score;
    }
}
