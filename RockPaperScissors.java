package rockpaperscissors;

import java.util.*;

/**
 * Rock Paper Scissors [play against computer: 3 Rounds]
 * @author Vivian
 */
public class RockPaperScissors {

    // Values for Move
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;

    public static void main(String[] args) {
        rules(); // Display Rules of the Game

        // Create Scanner Object and Option Variables
        Scanner S = new Scanner(System.in);
        int Option;
        int ComputerOption;

        // Score Tracking Variables
        int UserScore = 0;
        int ComputerScore = 0;

        // For Loop to Create 3 Rounds
        for (int i = 1; i <= 3; i++) {
            System.out.println("ROUND " + i);
            System.out.println();

            OptionsDisplay();
            System.out.println();
            System.out.print("You: > ");
            Option = S.nextInt();

            Random R = new Random(); // New Random Object
            System.out.print("Computer: > ");
            ComputerOption = R.nextInt(3) + 1;
            System.out.println(ComputerOption);

            // Determine Winner Each Round
            if (Option == ComputerOption) {
                System.out.println("Tie.");
            } else if (Option == ROCK && ComputerOption == PAPER) {
                System.out.println("Computer Wins! Paper beats Rock.");
                ComputerScore++;
            } else if (Option == PAPER && ComputerOption == ROCK) {
                System.out.println("You Win! Paper beats Rock.");
                UserScore++;
            } else if (Option == SCISSORS && ComputerOption == ROCK) {
                System.out.println("Computer Wins! Rock beats Scissors.");
                ComputerScore++;
            } else if (Option == ROCK && ComputerOption == SCISSORS) {
                System.out.println("You Win! Rock beats Scissors.");
                UserScore++;
            } else if (Option == PAPER && ComputerOption == SCISSORS) {
                System.out.println("Computer Wins! Scissors beats Paper.");
                ComputerScore++;
            } else if (Option == SCISSORS && ComputerOption == PAPER) {
                System.out.println("You Win! Scissors beats Paper.");
                UserScore++;
            }

            System.out.println("_______________________________________________"); // Divider
        }

        // Determine Overall Winner of the Game
        if (UserScore > ComputerScore) {
            System.out.println("Congrats, You Win!!!");
        } else if (UserScore < ComputerScore) {
            System.out.println("Computer Wins. Better Luck Next Time!");
        } else {
            System.out.println("Tie.");
        }

    }

    public static void rules() {
        System.out.println("RULES - ");
        System.out.println("Rock Beats Scissors.");
        System.out.println("Paper Beats Rock.");
        System.out.println("Scissors Beats Paper.");
        System.out.println();
        System.out.println("_______________________________________________"); // Divider
    }

    public static void OptionsDisplay() {
        System.out.println("Rock (1), Paper (2), Scissors (3)...Shoot!");
    }

}
