package src;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        //welcome message
        System.out.println("Welcome to HANGMAN!");
        System.out.println("What is your name? Please enter it below!");
        String userName = name.nextLine();
        System.out.println("Hello " + userName + ", here are the rules!");

        //create array/arrayList of words in WordLibrary (see about importing file of words)
            //words = {"ANIMAL", "RADIATOR", "LAPTOP","ENCYCLOPEDIA",etc};
        ArrayList<String> words = new ArrayList<>();
        //display new word blanked out e.g _ _ _ _ _ _ _
            //get RANDOM new word from WordLibrary
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));
            //split each character in word by " "

            //replace each character in word with _

        //player enters character in terminal
            //checks if character is valid input(letter)
                //->not number or special character
            //display "Invalid input" in terminal
            //if character is valid change input to uppercase
            //check if character is in word
                //if character is correct
                    //-> change all matching characters in word to show character.
                //if character is incorrect
                    //->display message "You have n lives remaining"
                    //->display HangmanDisplay for corresponding lives remaining
            //create list of characters already entered
                //if player re-enters guess display message "You have already guessed that letter!"
        //if all correct characters are entered
            //display message "Congratulations!"
        //if lives = 0 and characters are still hidden
            //display message "Better luck next time"

    }
}
