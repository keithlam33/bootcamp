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

    int result = 10 / 3;
    System.out.println(result);// 3


    int englishScore = 87;
    int mathScore = 72;
    int historyScore = 34;
    // step 1: int +int+int /3 = int 
    // step 2: assign int value into double box
    // result: 64 not 64.3333
    // main point: right to left, even declare avgscore as double
    double averageScore= (englishScore + mathScore + historyScore) / 3;
    System.out.println(averageScore);
    // solve 1: declaration int change to double
    // solve 2: int + int + int / 3.0 = double
    // solve 3: (double)(englishScore + mathScore + historyScore) ->double

    // System.out.println(10/0); 10/ 0= error undefine
    // int count = 0, 10/count = error

    System.out.println(0.1+0.2);// 0.3000000000004
    double d1 = 0.1;
    double d2 = 0.2;
    System.out.println(d1+d2);// 0.3000000000004
    // low level languages have lots of bug
    // double variable never be used for math operation + - * /
    // we use BigDecimal for math operation 

    // Overflow
    int i10 = 2_100_000_000;
    int i11 = i10 + 100_000_000;
    System.out.println(i11); // -2094967296 (overflow)
    // For primitive, it will not be error after math operation 
    // even it exceed the upper/ lower limit
    // solve: step 1 int+ long = long, step 2 assign long into long variable
    long l11 = i10 + 100_000_000L;// int+long = long, no int overflow
    System.out.println(l11);// result: 2_200_000_000
    


    // char -> int (ASCII)
    int v = 97;// step 1: define 97 into int
    char n = 'a';// step 2: define 'a' into char

    int v2 = n; // step 3 assign char into int
    System.out.println(v2);// result 97 ascii
    
    char n2 = 'A';
    int v3 = n2;
    System.out.println(v3);// result 65 ascii

    int v4 = '九';// assign char into int directly
    System.out.println(v4);// result 20061 ascii

    // int v5 = 20061;
    // char c20 = v5; cannot assign higher level into lower level type

    int value = (char)'A';// A - 65 (consent)
    System.out.println(value);
    
    
    long l12 = 2_200_000_000L;
    int v6 = (int)l12; // assign long into int with consent
    System.out.println(v6);

    // 65- A
    int v7 = 65;
    char c11 = (char)v7;//assign int into char with consent
    System.out.println(c11);

    int v8 = 65620;
    char c12 = (char)v8;
    System.out.println(c12);// T (65620-65535 = overflow)

  }
}
