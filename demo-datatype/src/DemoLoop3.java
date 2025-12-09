public class DemoLoop3 {
  public static void main(String[] args) {
    // Recap : while loop
    String s ="hello";
    int n =0;
    while (n<s.length()) {// copy for loop mid condition // know when stop
      System.out.println(s.charAt(n));
      n++;
    }
    // for (int i=0 ) {}
    // same iteration: access more than 1 element, like (s.charAt(i) and s.charAt(i+1))
    // read and write, use i
    for(int i =0; i <s.length(); i++) {
        System.out.println(s.charAt(i));
    }
    
    // for-each( loop through all elements once)
    // same iteration: access only one element
    //only read
    char[] chs = s.toCharArray();// string to char array
      for(char ch : chs) {
          System.out.println(ch);
      }
      

      // int[] 4, -8, 100, 34
      int[] numbers = new int[] { 4, -8, 100, 34};
      for( int number: numbers) {// number value just a name, can be anything 
        System.out.println(number);
      }
      // double[]
      double[] prices = new double[] {4.5, 90.9, 23.3, 10.2};
      for(double price: prices) {
        System.out.println(price);
      }


      // do-while ( the loop execute at least once)試一次 e.g. login
      //bingo -> do while
      n = 0;
      do {
          System.out.println("hello");
          n++;
      } while(n<5);

      // String method split()
      String email = "Dear Sir, I am writing to ... ";
      String[] words = email.split(" ");// return String[]
      for(String word : words) {
        System.out.println(word);
      }
      




  }
}
