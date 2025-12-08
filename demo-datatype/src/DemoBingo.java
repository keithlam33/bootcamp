import java.util.Random;
import java.util.Scanner;

public class DemoBingo {
   public static void main(String[] args) {
    // new Random().nextInt(3); 0-2
    
    // 1-100
    //  Random : 73
    // one user
    // 1 compare userinput to the random number
    // 2 if same, end game
    // 3 if not same, update the range
    //
    // loop 
    int bingo = new Random(). nextInt(100)+1;
    Scanner scanner = new Scanner(System.in);
    
    int userInput= -1;// 
    int guess;
    
    int min =1;
    int max= 100;

    while(userInput != bingo) {
      System.out.println("Please input a number between" + min + " to "+ max+ ":");
      userInput= scanner.nextInt();
       if(userInput == bingo) {
        System.out.println("BINGO!!!");
        break;
       }else if(userInput >bingo){
        min = userInput;
      
       }else {
        max = userInput;
       }
       if(userInput<min || userInput> max){
        System.out.println("Wrong input, please in put again.");
       }
       
      }

    
    

  

   }
}
