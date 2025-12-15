package SnakeAndLadder;

public class SnakeLadder {

    int position = 0;
    int diceCount = 0;

    public int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }

    public int checkOption() {
        return (int) (Math.random() * 3);
    }

    // returns true if Ladder (extra turn)
    public boolean playTurn(String playerName) {

        int dice = rollDie();
        diceCount++;

        int option = checkOption();
        int previousPosition = position;

        switch (option) {
            case 1: // Ladder
                position += dice;
                System.out.println(playerName + " got Ladder");
                break;

            case 2: // Snake
                position -= dice;
                if (position < 0)
                    position = 0;
                System.out.println(playerName + " got Snake");
                break;

            default:
                System.out.println(playerName + " got No Play");
        }

        if (position > 100) {
            position = previousPosition;
        }

        System.out.println(playerName + " rolled " + dice +
                " | Position: " + position);

        return option == 1;
    }
}
