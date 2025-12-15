package SnakeAndLadder;

public class SnakeLadder {

    int position = 0;
    int diceCount = 0;

    public int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }

    public int checkOption() {
        return (int) (Math.random() * 3); // 0-No Play, 1-Ladder, 2-Snake
    }

    public void playGame() {

        while (position < 100) {

            int dice = rollDie();
            diceCount++;

            int option = checkOption();
            int previousPosition = position;

            switch (option) {
                case 1: // Ladder
                    position += dice;
                    System.out.println("Ladder");
                    break;

                case 2: // Snake
                    position -= dice;
                    if (position < 0)
                        position = 0;
                    System.out.println("Snake");
                    break;

                default: // No Play
                    System.out.println("No Play");
            }

            // Exact 100 condition
            if (position > 100) {
                position = previousPosition;
            }

            System.out.println("Dice Rolled: " + dice +
                    " | Position: " + position);
        }

        System.out.println("\nGame Won!");
        System.out.println("Total Dice Rolls: " + diceCount);
    }
}