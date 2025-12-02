public class DemoMath {
  public static void main(String[] args) {
    // + - * / %
    int remainder = 10 % 3; // remainder of division
    System.out.println(remainder);

    remainder = 99% 8;
    System.out.println(remainder);
    // int
    int a = 7;
    System.out.println(a+9);
    System.out.println(a-6);
    System.out.println(a/7);
    System.out.println(a*9);

    a = a + 10; // right to left 7+10 a = 17 (int + int = int value)
    // a = , assigning int value 17 into a (int box) total 2 steps
    System.out.println(a);
    // double b = 3.5;
    // System.out.println(a+b);// int + double = double 20.5
    // step 1: int + double = double value
    // step 2: assign double value into double box
    int b = 8;
    System.out.println(b + 3.5);
    double r = b +3.5;

    // operation between higher level type and lower level type
    // result: higher level type
    long k = 3 * 100L; // int = 3, int * long = long value
    // int t = 3 * 100L; // int * long= long, cannot assign to int box

    // level accord: byte - short - int - long - float - double
    // *int-long-double
    float f1 = 10L;
    byte b10 = 9;
    short s10 = 9;
    // short s20= b10+s10; // byte + short = int value
    int s20 = b10 + s10; // ok 
    // int * double in real life, buying e.g. rice $8.88, quantity: 3 3*8.88

    
    // char - int


  }
}
