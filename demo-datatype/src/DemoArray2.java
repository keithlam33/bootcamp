import java.util.Arrays;

public class DemoArray2 {
  public static void main(String[] args) {
    // array -> for loop
    String name1 = "John";
    String name2 = "Cathy";
    String name3 = "Jenny";

    String[] students = new String[3];
    students[0] = name1; // students is an address, pointing to object"John", not name1
    students[1] = name2;
    students[2] = name3;
    for( int i=0; i<students.length; i++) {
        System.out.println(students[i]);
    }
    name1 = "Leo"; // sysout students[0]wont change, 
    // name and students[] are object reference, cant point at each other,
    // only points at object
    // before name1=leo, john is being pointed by two addresses, studetns[0]and name1
    // now name1 pointed to leo, only students[0] still pointed to John
  
 for( int i=0; i<students.length; i++) {
        System.out.println(students[i]);
    }

    //algorithm
    // swap
    int a =10;// apple juice
    int b =20;// orange juice
    // if need to swap the apple juice into the glass of orange juice
    int c =a;// need a new variable to first let apple juice to put inside so that the glass is empty
    a=b;
    b=c;
    System.out.println("a = " +a);
    System.out.println(b);

    // 2 max / min
    int[] scores = new int[] {23, 8, 97, 56};
    int max = scores[0];  // extra variable for comparison, same concept of swap
    for (int i = 0; i <scores.length; i++) {
        if (scores[i]>max) {// if the comparison of new score bigger
          max = scores[i]; // put the new score into the maximum number 
        }
        }System.out.println(max);

      int min = scores[0];// for comparison
       for (int i =0; i<scores.length; i++) { 
        if (scores[i]<min) {// comparison
          min = scores[i];// put the lower score into the minimum number
       }
      } System.out.println(min);
      
      // int max = scores[0];
      //int min = scores[0];
      //for (int i = 0; i <scores.length; i++) {
       // if (scores[i]<max) {
        // max = scores[i];  
        //  }if (scores[i]>min) {
        //  min = scores[i];
       // }
       // }

       //3 move the max value to tail
       scores = new int[] { 23,100, 8, 97, 56};
      int backup = scores[0];
      
      for( int i=0; i<scores.length-1; i++) { // i+1 > length, so length -1, it still runs a round
        if (scores[i]> scores[i+1] ) {
          backup = scores[i];//
          scores[i] = scores[i+1];
          scores[i+1] = backup;
        }
      }
      System.out.println(scores[scores.length-1]);
      
      // 4. algorithm: bubble sort
      // x,x,x,x,100
      //x,x,x,97,100
      //x,x,56,97,100, etc. 
      //x, 23,56,97,100, done here
      // it's basic method
      for( int i=0; i<scores.length-1 ; i++) {// run how many round
        for(int j=0; j<scores.length-i-1; j++) {  // procedure of comparison 
        // -i 這一輪只要比到『還沒排好的最後位置』就夠了，不用每次都比到最尾巴
        if (scores[j] > scores[j+1]) {
            backup = scores[j];
            scores[j]= scores[j+1];
            scores[j+1]=backup;
          }
        }
    }System.out.print(Arrays.toString(scores) );

     
      
        
        



  }
}
