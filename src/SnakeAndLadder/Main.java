package SnakeAndLadder;

public class Main {

    public static void main(String[] args) {

        SnakeLadder player1 = new SnakeLadder();
        SnakeLadder player2 = new SnakeLadder();

        boolean playerOneTurn = true;

        System.out.println("Two Player Snake & Ladder Game Started");

        while (true) {

            if (playerOneTurn) {
                boolean extraTurn = player1.playTurn("Player 1");

                if (player1.position == 100) {
                    System.out.println("\n🎉 Player 1 WON!");
                    System.out.println("Dice Rolls: " + player1.diceCount);
                    break;
                }

                if (!extraTurn)
                    playerOneTurn = false;

            } else {
                boolean extraTurn = player2.playTurn("Player 2");

                if (player2.position == 100) {
                    System.out.println("\n🎉 Player 2 WON!");
                    System.out.println("Dice Rolls: " + player2.diceCount);
                    break;
                }

                if (!extraTurn)
                    playerOneTurn = true;
            }
        }
    }
}