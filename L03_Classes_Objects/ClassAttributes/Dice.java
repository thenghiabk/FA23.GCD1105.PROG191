package L03_Classes_Objects.ClassAttributes;

import java.util.Random;

public class Dice {
    private static final int MAX_NUMBER = 6;
    private static final int MIN_NUMBER = 1;
    private static final int NO_NUMBER = 0;

    private int number;
    private Random random;
    public Dice() {
        random = new Random();
        number = NO_NUMBER;
    }

    // Rolls the dice
    public void roll() {
        number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }

    // Returns the number on this dice
    public int getNumber() {
        return number;
    }
}
