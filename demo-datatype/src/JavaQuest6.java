public class JavaQuest6 {
  public static void main(String[] args) {
    
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ... 
   * 
   */
  
    int first = 0, second = 1;
    int next =first + second;
    String result = "";
    // for loop to print first 15 numbers in Fibonacci Sequence
         result += first + " " + second;
        for(int j=0; j<15-2; j++) {// sum
          next = first +second;
          result += " "+ next;

          first =second;
          second= next;
          
        }
        System.out.println(result);
          
    
  


  }
}
