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
        int previousPosition = position;

        switch (option) {
            case 1:
                position += dice;
                break;
            case 2:
                position -= dice;
                if (position < 0)
                    position = 0;
                break;
        }

        if (position > 100) {
            position = previousPosition;
        }

        System.out.println("Position: " + position);
    }
}
