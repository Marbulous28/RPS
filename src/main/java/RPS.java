import java.util.Random;

public class RPS {

  public static void main(String[] args) {

  }
  public static String checkWinner(String choice1, String choice2){
    // Random myRandomGenerator = new Random();
    // Integer randomNum = myRandomGenerator.nextInt(3);
    //String cpuChoice = "rock";
    // if ( randomNum == 0) {
    //   cpuChoice = "rock";
    // }else if ( randomNum == 1) {
    //   cpuChoice = "paper";
    // }else{
    //   cpuChoice = "scissors";
    // }
    //Receives form info and stores in variable
    String response = "";
    if(choice1.equals("rock") && choice2.equals("scissors")||choice1.equals("paper") && choice2.equals("rock")|| choice1.equals("scissors") && choice2.equals("paper")) {
      response = "Player One Wins";
      return response;
    }else if (choice2.equals("rock") && choice1.equals("scissors")||choice2.equals("paper") && choice1.equals("rock")|| choice2.equals("scissors") && choice1.equals("paper"))  {
      response = "Player Two Wins";
      return response;
    }else {
      response = "Tie";
      return response;
    }
  }
}
