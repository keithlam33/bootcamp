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
    Scanner scanner = new Scanner(System.in);  // java usually use in processing, not collect inputs
    
    
    int userInput= -1;// 
    int min =1;
    int max= 100;
    
    while(userInput != bingo) {
      
      System.out.println( "Please input a number between" + min + " to "+ max+ ":");
      // rule under loop because it appears every round
      userInput= scanner.nextInt();

      if (userInput < min || userInput > max) {
                System.out.println("Wrong Answer, please answer between " + min + " to " + max);
                continue;  // skip this round re-answer
            }
       if(userInput >bingo){
            max = userInput-1;
       }  else if (userInput <bingo ){
            min = userInput+1;   
       } 

       
      }System.out.println("Bingo!!!the number is ");
      

    
    

  

   }
}
