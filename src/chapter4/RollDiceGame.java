package chapter4;

import java.util.Random;

public class RollDiceGame {
    public static void main(String[] args) {
        System.out.println("Let's play the roll the dice game!!!");

        int maxRolls = 5;
        int currentRoll = 0;
        int currentSpace = 0;
        int lastSpace = 20;





        do {

            Random random = new Random();
            int die = random.nextInt(6) + 1;
            currentRoll++;

            currentSpace = die + currentSpace;

            if (currentRoll >= 5 && currentSpace < lastSpace) {
                System.out.println("Roll #" + currentRoll + ": You've rolled a " + die +
                        ". You're on space " + currentSpace + ".You did not win the game");
            }
            else if (currentSpace > lastSpace) {
                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            }
            else if (currentSpace == lastSpace) {
                System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            }
            else {
                int remainingSpaces = lastSpace - currentSpace;
                System.out.println("Roll #" + currentRoll + ": You've rolled a " + die +
                        ". You're on space " + currentSpace + ". You have " + remainingSpaces + " to go!");
            }
        } while (currentRoll < maxRolls);
    }
}
