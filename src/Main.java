package src;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner name = new Scanner(System.in);
        //String word = "hello";

        //welcome message
//        System.out.println("Welcome to HANGMAN!");
//        System.out.println("What is your name? Please enter it below!");
//        String userName = name.nextLine();
//        System.out.println("Hello " + userName + ", here are the rules!");

        //USE COMMANDS

        //create array/arrayList of words in WordLibrary (see about importing file of words)
            //words = {"ANIMAL", "RADIATOR", "LAPTOP","ENCYCLOPEDIA",etc};
//        ArrayList<String> words = new ArrayList<>();
//        {
//            words.add("");
//        }
//        public ArrayList<String> getWords(){
//            return words;
//        }
//        public String getHangmanWord(){
//            String randomWord = words.get((int)(Math.random()* words.size()));
//            return randomWord;
//        }
//        public void turnWordToDashes(){
//            String randomWord =getHangmanWord)();
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < randomWord.length(); i++) {
//                sb.append(" _ ")
//            }
//        }

        //in main
//        Words hangmanWords = new Words();

        //display new word blanked out e.g _ _ _ _ _ _ _
            //get RANDOM new word from WordLibrary
            //make function getRandomWord()
//        Random random = new Random();
//        String word = words.get(random.nextInt(words.size()));

        //split each character in word by " _ "
//        String [] wordArr = word.split("(?!^)");
//        for(String wordChar : wordArr){
//            System.out.println(wordChar +" _ ");
//        }
            //replace each character in word with _

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
