public class JavaQuest8 {
  public static void main(String[] args) {
    

    
  /**
   * Write a loop to find the second max number.
   * Example Output for testCase1:
   * Second Max = 230
   */
  
  
    int[] testCase1 = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int[] testCase2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    int[] testCase3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    int[] testCase4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax=0;
    int[] allTestcase = testCase2;
    int max=0 ;
    // code here ...
      for( int i=0; i<allTestcase.length-1; i++){// each number
          for(int j=0; j<allTestcase.length-i-1; j++) {// compare
            if (allTestcase[j] >allTestcase[j+1]) {
                max= allTestcase[j];
                allTestcase[j]= allTestcase[j+1];
                allTestcase[j+1] = max;
            }

          }

      } 
      secondMax = allTestcase[allTestcase.length-2]; 
      System.out.println(secondMax);
     

  }
}
