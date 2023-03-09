package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //welcome message
        //USE COMMANDS


        String word = "chocolate";
        System.out.println(word);
        StringBuilder hangmanWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            hangmanWord.append(" _ ");
        }
        System.out.println(hangmanWord);
        //create array/arrayList of words in WordLibrary (see about importing file of words)

        //in main
    //        Words hangmanWords = new Words();
        //display new word blanked out e.g _ _ _ _ _ _ _//
            //get RANDOM new word from WordLibrary//
            //make function getRandomWord()//
            //replace each character in word by " _ "//
        //player enters character in terminal
//        Scanner character = new Scanner(System.in);
//        String inputChar = character.nextLine();
//
//            //checks if character is valid input(letter)
//        if (inputChar.length() != 1){
//            System.out.println("Please enter a letter");
//        }

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
