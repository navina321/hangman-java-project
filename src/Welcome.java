package src;

import java.util.Scanner;

public class Welcome {
    Scanner name = new Scanner(System.in);
    public void WelcomeMessage(){
        System.out.println("Welcome to HANGMAN!");
        System.out.println("What is your name? Please enter it below!");
        String userName = name.nextLine();
        System.out.println("Hello " + userName + ", here are the rules!");
    }
}
