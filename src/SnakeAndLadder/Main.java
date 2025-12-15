package SnakeAndLadder;

public class Main {
    public static void main(String[] args) {
        SnakeLadder player = new SnakeLadder();
        int option = player.checkOption();
        System.out.println("Option: " + option);
    }
}