package src;

import java.util.Scanner;

public class GameNarrator {

    Scanner name = new Scanner(System.in);
    Scanner inputLetter = new Scanner(System.in);

    public void welcomeMessage(){
        System.out.println("Welcome!!!");
        System.out.println("What is your name? Please enter it below!");
        String userName = name.nextLine();
        System.out.println("Hello " + userName + ", let's play HANGMAN!");
    }

    public void letterInputRequest(){
        System.out.println("Please enter a letter!");
        String letter = inputLetter.nextLine();
    }
}
