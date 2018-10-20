package org.pursuit;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame implements Game {
    @Override
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10)+ 1;
        int guess;
        do{
            System.out.println("Guess a number between 1 and 10: ");
            guess = scanner.nextInt();

        }while(guess != randomNumber);
        System.out.println("You've guessed the right number: " + randomNumber + "!");
    }
}
