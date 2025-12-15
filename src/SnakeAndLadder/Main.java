package SnakeAndLadder;

public class Main {
    public static void main(String[] args) {
        SnakeLadder player = new SnakeLadder();
        int dice = player.rollDie();
        System.out.println("Dice rolled: " + dice);
    }
}
