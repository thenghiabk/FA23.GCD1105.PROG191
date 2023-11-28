package L03_Classes_Objects.ClassAttributes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userPromt = "";

        Dice dice = new Dice();

        // roll dice
        do {
            System.out.print("Roll(r) or Quit(q): ");
            userPromt = scanner.nextLine();

            if (userPromt.equalsIgnoreCase("R")){
                dice.roll();
                System.out.println("Your number: " + dice.getNumber());
            }

        } while (!userPromt.equalsIgnoreCase("Q")); // terminal while loop

        System.out.println("Bye. Have a nice day!");
    }
}
