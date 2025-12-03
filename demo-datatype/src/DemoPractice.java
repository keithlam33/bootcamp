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
      // boolean isXxxx = true/false
      // assign int into long, ok
      // assign long into int, can't
      int i1 = 8;
      System.out.println(i1+ 5.5);// int + double = double

      // assign int into char, not ok
      // int i2 = 70;
      // char c2 = i2;
      // System.out.println(c2);
      int i3 = 70;
      char c3 = (char)i3; // assign int into char with consent
      System.out.println(c3);

      // assign char into int
      char c4 = 'g';
      int i4 = c4;
      System.out.println(i4);

      // overflow int 2_200_000_000
      int i5 = 2_100_000_000;
      long l5 = i5 + 200_000_000L; // right to left, right: int + long = long
      // left: define a long variable
      System.out.println(l5);

      // ASCII 
      char c5 = 'K';
      int i6 = c5;
      System.out.println(i6); // result 75
      //ASCII with overflow
      int i7 = 65611; 
      char c6 = (char)i7;
      System.out.println(c6); // ascii 75 = k, 65535+75 =65610, overflow+1= 65611
  }
}
