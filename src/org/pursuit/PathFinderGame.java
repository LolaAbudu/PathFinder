package org.pursuit;

import java.util.Scanner;

public class PathFinderGame implements Game{
    Scanner scanner = new Scanner(System.in);
    int tile; //created to save the number of tiles left
    int roll;

    @Override
    public void startGame(){  //this method starts the game
        logo();
        instruction();
        tile = 90;
        checkValue();
    }

    private void logo(){
        System.out.println("######                      #######\n" +
                "#     #   ##   ##### #    # #       # #    # #####  ###### #####\n" +
                "#     #  #  #    #   #    # #       # ##   # #    # #      #    #\n" +
                "######  #    #   #   ###### #####   # # #  # #    # #####  #    #\n" +
                "#       ######   #   #    # #       # #  # # #    # #      #####\n" +
                "#       #    #   #   #    # #       # #   ## #    # #      #   #\n" +
                "#       #    #   #   #    # #       # #    # #####  ###### #    #\n");
    }

    private void instruction(){
        System.out.println("Instructions:\n");
        System.out.println("This game is called 'PathFinder'. The goal of this game is to reach the end of the path, 100 tiles.\n" +
                "You start at the first tile, then press enter to roll.\n" +
                "You can roll any number from 1 to 10 - then move that number of tiles forward.\n" +
                "If you roll a 7, you get to move 7 tiles, plus a random roll between 1 an 10.\n" +
                "If you roll a 10, you move back a random roll from between 1 and 10.\n" +
                "If the random roll is greater than your current tile, you move back to the first tile.\n" +
                "Good luck!\n");
    }

    private void input(){
        System.out.println("\nPress enter to roll...");
       scanner.nextLine();
       roll = roll();
    }

    private int roll(){
        int random = (int) Math.ceil(Math.random() * 10); //this generates a random number from 1-10 and rounds it up to whole number
        return random;
    }

    private void checkValue(){

        do {
            System.out.println("Current tile: " + tile);  //does this line
            System.out.println("Tiles to go " + (100 - tile));
            input();
            int newRoll = roll();  //this stores the value of the new roll
            if (roll == 7) {
                System.out.println("Great luck! You've rolled a 7! Move forward your roll, plus " + newRoll+ " extra spaces!");
                tile = tile + roll + newRoll;  //the first roll is the original 7 that was rolled, the second roll() is generating another random roll

            } else if (roll == 10) {
               // System.out.println("You hit 10!");
                if (tile <= 10 && newRoll >= tile) {   //if the tile is less than 10
                    System.out.println("Oh no! You've rolled a 10! Move back to the first tile");
                    tile = 1;
                    //reset the tile to 1
                } else {
                    System.out.println("Oh no! You've rolled a 10! Move back " + newRoll+ "spaces!");
                    tile = tile - newRoll;
                }
                //System.out.println("Your tiles are " + tile);
            } else {
               // System.out.println("Nothing special, changing tile from " + tile + " to " + (tile + roll));
                System.out.println("You rolled a " + roll + "!");
                tile = tile + roll;  //if its neither 10 or 7, add the parameter roll to the current tile
                //System.out.println("New Value " + tile);
            }
        } while(tile < 100);
        System.out.println("Congrats! You've reached the end of the path!");
        gameOverMaybe();  //called this so it does that method below which asks the user if the want to play again and it starts it over or ends it
    }

    private void gameOverMaybe() {

        String input;
        do {
            System.out.println("\nPlay again? [Y/n]:");
            input = scanner.nextLine();
            if (input.length() == 0 || input.charAt(0) == 'y' || input.charAt(0) == 'Y') {  //this says if the input is empty; meaning they just pressed enter  or if the entered y or Y
                startGame();
            } else if (input.charAt(0) == 'n' || input.charAt(0) == 'N') {
                System.out.println("Goodbye! Thanks for playing 'PathFinder'!");
                break;
            } else {
                System.out.println("Sorry, does not compute...");
            }
        }while(input.length() != 0 || input.charAt(0) != 'y' || input.charAt(0) != 'Y' || input.charAt(0) != 'n' || input.charAt(0) != 'N');
    }
}
