public class practice {
  public static void main(String[] args) {
     /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ... 
   * 
   */
  
    int first = 0, second = 1;
    int next =0;
    String result = first +" "+ second;
    for( int i=0; i <13; i++) {
        next = first + second;
        result += " " +next;
        first = second;
        second = next;
        
        
    }
System.out.println(result);

  }
}
