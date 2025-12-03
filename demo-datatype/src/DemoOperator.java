public class DemoOperator {
  public static void main(String[] args) {
    // +1 
    int x = 3;
    x = x+1;// 4
    x += 1; // 5 // most use
    x++; // 6
    ++x; // 7
    System.out.println(x);//7
    // -1
    int y = 8;
    y = y-1; // 7
    y -=1; // 6 //most use
    y--; // 5
    --y; // 4
    System.out.println(y); // 4

    // +2
    int a =9;
    a = a +2;
    a += 2;
    System.out.println(a); // 13
    // *2
    a*=2;// a= a*2
    System.out.println(a); // 26
    // /2
    a/=2;// a = a/2
    System.out.println(a); // 13

    // the difference between x++ and ++x
    int j = 11;
    System.out.println(++j*8); // +1 first, then 12 *8
    System.out.println(j); // 12
    int k = 11;
    System.out.println(k++*8); // 11*8, +1 after the operation
    System.out.println(k); // k + 1 =12

    int h = 14;
    System.out.println(h++*2 *++h); //448
    // step 1 14 x 2 = 28
    // step 2 h become 15
    // step 3 28 x (15+1)= 448
    System.out.println(h);

    // Operator !
    int age = 66;
    boolean isElderly = age >65;// use boolean, give meaning, give variable name
    if (isElderly == true) {

    }
    if (isElderly) {

    }
    // check if it is not an elderly, use !
    if (!isElderly) {

    }
    int t =100;
    boolean result = t>=90;
    System.out.println(result); // true

    // true / false
    int e =5;
    System.out.println(e>3 && e<10); // && AND //have to fulfil two conditions
    System.out.println(e>3 || e >20);// || or // fufil one condition

    System.out.println(true || false);// true, yellow line under false= never reach
    System.out.println(true || true); // true
    System.out.println(false || false);// false
    System.out.println(false || true);// true
    
    System.out.println(true && true);// true
    System.out.println(true && false);// false
    System.out.println(false && true);// false
    System.out.println(false && false); // false
    
      
   

  }
}
