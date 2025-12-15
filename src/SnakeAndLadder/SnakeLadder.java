package SnakeAndLadder;

public class SnakeLadder {
    int position = 0;

    public int rollDie() {
        return (int)(Math.random() * 6) + 1;
    }

    public int checkOption() {
        return (int)(Math.random() * 3); // 0-No Play, 1-Ladder, 2-Snake
    }
}