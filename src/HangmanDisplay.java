package src;

public class HangmanDisplay extends Lives{

    public HangmanDisplay(int livesLeft) {
        super(livesLeft);
    }

    public void drawHangman(){
        int livesLeft = 8;
        if(livesLeft == 8){
            System.out.println("   |----¬");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        else if(livesLeft ==7){
            System.out.println("   |---¬");
            System.out.println("   |   O");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        else if(livesLeft ==6){
            System.out.println("   |----¬");
            System.out.println("   |    O");
            System.out.println("   |    |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        else if(livesLeft ==5){
            System.out.println("   |----¬");
            System.out.println("   |    O");
            System.out.println("   |   (|");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }else if(livesLeft ==4){
            System.out.println("   |----¬");
            System.out.println("   |    O");
            System.out.println("   |   (|)");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }else if(livesLeft ==3){
            System.out.println("   |----¬");
            System.out.println("   |    O");
            System.out.println("   |   (|)");
            System.out.println("   |   /");
            System.out.println("   |");
            System.out.println("___|___");
        }else if(livesLeft ==2){
            System.out.println("   |----¬");
            System.out.println("   |    O");
            System.out.println("   |   (|)");
            System.out.println("   |   ||");
            System.out.println("   |");
            System.out.println("___|___");
        }
        else if(livesLeft ==1){
            System.out.println("   |---¬");
            System.out.println("   |   O");
            System.out.println("   |  (|)");
            System.out.println("   | _/|");
            System.out.println("   |");
            System.out.println("___|___");
        } else {
            System.out.println("   |----¬");
            System.out.println("   |    O");
            System.out.println("   |   (|)");
            System.out.println("   |  _/|_");
            System.out.println("   |");
            System.out.println("___|___");
        }
    }
}
