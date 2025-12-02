public class DemoPractice {
  public static void main(String[] args) {
    // byte 256 -128to 127
      byte b1 = 10; 
      byte b2 = 116;
      System.out.println(b1+b2);// byte + byte = byte
    //short -32768 to 32767
      short s1 = 30000;
      short s2 = 2700;
      System.out.println(s1+s2);// short+short=short
      System.out.println(b1+s2);// byte + short = int
      // assign int into long, ok
      // assign long into int, can't
      int i1 = 8;
      System.out.println(i1+ 5.5);// int + double = double

  }
}
