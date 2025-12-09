public class DemoWrapper {
  public static void main(String[] args) {
    //wrapper class
    // 8 primitives -> 8 wrapper class
    int x =3;// variable but not object

    //Box(object)
    Integer x2 = 3; // x2 is an object
    // same: + operation
    x=x+3;
    x2= x2+3;

    //difference
    // range of x: -2.1b to 2.1b(int)
    // range of x2: -2.1b to 2.1b and also NULL;
    x2 = null;// not 0
    // x2+= 3; // java.lang.NullPointerException 

    //
    byte b1 =4;
    Byte b2 =4;

    //
    short s1 =5;
    Short s2 = 5;

    // 
    long l1 =6;
    // Long l2 = 6; // 6 -int -> 6 (long) -> long
    Long l2 = 6L; // 6(long) -> long
    //Java doesn't allow multi conversion (twice or more)

    // 
    float f1 = 9.5f;
    Float f2 = 9.5f;

    //
    double d1 = 5.5;
    Double d2 = 5.5;

    // 
    char c1 = 'c';
    Character c2 = 'c';
    System.out.println(c2+2); // 101
    System.out.println(c1+2);// 101

    //
    boolean bl1 = true;
    Boolean bl2 = true;

    // auto-box
    // assign primitive into wrapper class
    int x10 = 10;
    Integer x20 = x10; 
    x20.doubleValue();// ->10.0  可以自己進行修改
    // Never use >, <, ==, <=, >= for Wrapper class 
    System.out.println(x20.equals(10)); // true
    System.out.println(x20.compareTo(10));// 0 
    System.out.println(x20.compareTo(8));// 1 
    System.out.println(x20.compareTo(9)); // 1
    System.out.println(x20.compareTo(12)); // -1
    // ok to use +-*/ for Integer
    // double -> Bigdecimal
    if(x20.compareTo(6)>0) {
      System.out.println("x20> 6.");
    }

    int x30 = x20; // auto un-box
    System.out.println(x30);// 10


  }
}
