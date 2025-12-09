import java.util.Random;
import java.util.Scanner;

public class DemoBingo2 {
  public static void main(String[] args) {
    
    // two players
    int bingo = new Random(). nextInt(100)+1;
    Scanner scanner = new Scanner(System.in);  // java usually use in processing, not collect inputs
    
    
    int userInput= -1;// 
    int min =1;
    int max= 100;
    
    boolean isUserA = true;
      String  userNow = "";
    while(userInput != bingo) {
      userNow = isUserA ? "User A": "User B";
      System.out.println(userNow + ", Please input a number between" + min + " to "+ max+ ":");
      // rule under loop because it appears every round
      userInput= scanner.nextInt();

      if (userInput < min || userInput > max) {
                System.out.println("Wrong Answer, please answer between " + min + " to " + max);
                continue;  // skip this round re-answer
            }
       if(userInput == bingo) {
        System.out.println("BINGO!!!" + userNow + " Wins!!");
        break; // end game
       }    else if(userInput >bingo){
            max = userInput-1;
            System.out.println(" Between "+ min+ "to " + max);
       }       else {
            min = userInput+1;
            System.out.println(" Between "+ min+ "to " + max);
       } 
       isUserA = !isUserA;
      }
  }
}
