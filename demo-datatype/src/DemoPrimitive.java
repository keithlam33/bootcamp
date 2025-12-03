public class DemoPrimitive {
  public static void main(String[] agrs) {
    // integer
    // from right to left (put value 3 into a box x)
    // Declare the type of x (as integer)
    // every box only can be declared once
    // Assignment(assign value 3 into x)
    int x = 3; 
    System.out.println(x); // 3
    // Re-assignment
    // Replace the box value by 100
    x = 100;
    System.out.println(x); // 100 

    x = -200; // Re-assignment
    System.out.println(x); // -200

  
    // number with decimal 
    double y = 3.14159;
    double z = 3.0;
    double a = 10; // assign 10 (integer)into a double box,convert 10to10.0
        System.out.println(y); 
        System.out.println(z); 
        System.out.println(a); // 10.0 not 10
    // int k = 10.5; decimal no. cant be declare as int, 
    // usage of memory different

    // char (character, can be eng chinese japanese, etc.) 
    char h = 'e';
        System.out.println(h); 
        h = 'k'; // re-assign value k into h
                System.out.println(h); 
    // sysout hotkey
  
    h = '朽'; 
    System.out.println(h);

    // boolean true false
    // cant start with no. or capital letter, always character no "_"
    boolean isElderly = true; // variable name cares, easy to read 
    boolean isMarried = false;
    boolean isAdult = true;
    System.out.println("isMarried=" + isMarried);

    // integer, byte, short, long
    byte b1 = 127; // range: -128 to 127
    short s1 = 32767; // range: -32768 to 32767
    // there is no byte value and short value in java
    // 32767 is int value
    int i1 = 2_140_000_000; // by default we use int for integer
    // long 's range: 2^63
    long l1 = 1270; // assign int value into long
    // long l8 = 555L/l; L/l ok but l not readible, similar as 1
    // int i7 = 1270L; // assign long value into int box not ok 
    // always use int 

    // decimal number: double, float
    // float seldom use
    // 3.5 (double value) ->float box unsafe
    double d1 = 3.5;
    // float f1 = d1; unsafe

    float f2 = 3.5f; // 3.5f is a float value 
    // assign float value into float box
    double d2 = 3.5f; // assign float value into double box

    // you cannot read the box without assigning value
    int j;
    j = 10; 
    System.out.println(j);

    // char c13 =''; not ok
    char c14 = ' '; // ok
    // char c15 = 'ab' not ok



  }
}
