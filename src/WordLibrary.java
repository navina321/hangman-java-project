package src;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordLibrary {
    public static ArrayList<String> words = new ArrayList<>();

    public static String hangmanWord;

    public static String dashWord;

    public static Random random = new Random();

    public static Scanner scanner = new Scanner(System.in);

    static {
        words.add("encyclopedia");
        words.add("camouflage");
        words.add("basketball");
        words.add("conductor");
        words.add("hierarchy");
        words.add("requirement");
        words.add("volcano");
        words.add("equinox");
        words.add("folklore");
        words.add("promotion");
        words.add("witness");
        words.add("evaluate");
        words.add("country");
        words.add("conversation");
        words.add("promote");
        words.add("trick");
        words.add("halloween");
        words.add("testify");
        words.add("loyalty");
        words.add("camera");
        words.add("serious");
//        words.add("");
        hangmanWord = generateRandomWord();
        dashWord = changeLettersToDashes();
    }

    public WordLibrary() {
    }

//    public static ArrayList<String> getWords() {
//        return words;
//    }
//
//    public static void setWords(ArrayList<String> words) {
//        WordLibrary.words = words;
//    }
//
//    public static Random getRandom() {
//        return random;
//    }
//
//    public static void setRandom(Random random) {
//        WordLibrary.random = random;
//    }

    //generate random word from words ArrayList
    public static String generateRandomWord(){
        return words.get(random.nextInt(words.size()));
    }
    //change letters to _ in word
    public static String changeLettersToDashes() {
        System.out.println(hangmanWord);
        return "_".repeat(hangmanWord.length());
    }

    // check if input is valid

    public static String checkValidInput(){
        String letter = scanner.nextLine();
        while(letter.length() != 1 || Character.isDigit(letter.charAt(0))){
            System.out.println("Invalid Input! Please enter a letter!");
            letter = scanner.nextLine();
        }
        return letter;
    }

    //check word contains letter and change _ to letter
    public static boolean checkWordContainsLetter(){
        String letter = checkValidInput();
        char character = letter.charAt(0);
        if(hangmanWord.contains(letter)){
            int index = hangmanWord.indexOf(letter);
            dashWord = dashWord.substring(0,index) + character + dashWord.substring(index+1);
            System.out.println(dashWord);
            return true;
        }else {
            System.out.println("Incorrect Guess! Please enter another letter");
            return false;
        }
    }
}
