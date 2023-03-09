package src;

public class Lives {
    private int livesLeft  = 8;

    public Lives(int livesLeft) {
        this.livesLeft = livesLeft;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void setLivesLeft(int livesLeft) {
        this.livesLeft = livesLeft;
    }

    //method
    //if correct letter is entered by player, lives left remains the same
    //if incorrect letter is entered by player, lives left decreases by 1

//    public String inputletter;

//    public void livesRemaining(){
//        if(word.contains(inputletter){
//          System.out.println(getLivesLeft())
//        } else {
//          System.out.println(setLivesLeft())
//        }
//    }
}
