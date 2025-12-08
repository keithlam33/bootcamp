public class JavaQuest5 {
  public static void main(String[] args) {
    
  /**
   * Expected output:
   * The index of the last character of c is 11
   */

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';
    boolean isFound = false;
    
    for( int i=0; i<str.length(); i++) {
        if(str.charAt(i)== 'c') {
           isFound = true;
          break;
        }   
      }
    if (isFound) {
        System.out.println("Found.");
    }else {
        System.out.println("Not Found.");
    }
      System.out.println("The index of the last character of c is" + str.lastIndexOf('c'));
  
  }
}
