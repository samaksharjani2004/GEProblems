package SnakeAndLadder;

public class SnakeLadder {
    int position = 0;

    public int rollDie() {
        return (int)(Math.random() * 6) + 1;
    }

    public int checkOption() {
        return (int)(Math.random() * 3);
    }

    public void playTurn() {
        int dice = rollDie();
        int option = checkOption();

        switch (option) {
            case 1: // Ladder
                position += dice;
                break;
            case 2: // Snake
                position -= dice;
                if (position < 0)
                    position = 0;
                break;
            default:
                break;
        }

        System.out.println("Position: " + position);
    }
}