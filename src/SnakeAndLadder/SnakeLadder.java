package SnakeAndLadder;

public class SnakeLadder {
    int position = 0;

    public int rollDie() {
        return (int)(Math.random() * 6) + 1;
    }
}
