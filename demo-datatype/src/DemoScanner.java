import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);// create scanner
    System.out.println("Please input a number:");
    int input = scanner.nextInt();// Ask Question , expect what type next Int

    if (input%2 ==0) {
      System.out.println("This is an even number.");
    }else{
      System.out.println("This is an odd number.");
    }
    System.out.println("input = " + input);




    
  }
}
