package src;

import java.util.ArrayList;
import java.util.Random;

public class WordLibrary {
    private static ArrayList<String> words = new ArrayList<>();

    private static Random random = new Random();

    static {
        words.add("ENCYCLOPEDIA");
        words.add("CAMOUFLAGE");
        words.add("BASKETBALL");
        words.add("CONDUCTOR");
        words.add("HIERARCHY");
        words.add("REQUIREMENT");
        words.add("VOLCANO");
        words.add("EQUINOX");
        words.add("FOLKLORE");
        words.add("PROMOTION");
        words.add("WITNESS");
        words.add("EVALUATE");
        words.add("COUNTRY");
        words.add("CONVERSATION");
        words.add("PROMOTE");
        words.add("TRICK");
        words.add("HALLOWEEN");
        words.add("TESTIFY");
        words.add("LOYALTY");
        words.add("CAMERA");
        words.add("SERIOUS");
//        words.add("");
    }

    public WordLibrary() {
    }

    public static ArrayList<String> getWords() {
        return words;
    }

    public static void setWords(ArrayList<String> words) {
        WordLibrary.words = words;
    }

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        WordLibrary.random = random;
    }

    public static String generateRandomWord(){
        return words.get(random.nextInt(words.size()));
    }

    public void changeLettersToDashes() {
        String randomWord = generateRandomWord();
        StringBuilder hangmanWord = new StringBuilder();
        for (int i = 0; i < randomWord.length(); i++) {
            hangmanWord.append(" _ ");
        }
        System.out.println(hangmanWord);
    }
}
