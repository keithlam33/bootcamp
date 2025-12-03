public class DemoLoop {
  public static void main(String[] args) {
    int x =3;
    x*=3;
    x*=3;
    System.out.println(x);// 27
    // for (initialization); critria to continue; modifier)
    x=3;

    for( int i=0;i<4 ; i++){
        x *= 3;
    }
      System.out.println(x);// 243 
    // step 1: i=0
    // step 2: i<4
    // Step 3: x *=3
    // step 4: i++, i ->1
    // step 5: i <4? yes
    // step 6: x *=3

    // step 7: i++, i ->2
    // step 8: i <4? yes
    // step 9: x *=3

    // step 10: i++, i ->3
    // step 11: i <4? yes
    // step 12: x *=3

    //step 13: i++, i -> 4
    // step 14: i <4, no -> exit loop
    // total of x *=3 , 4 times
    // for(int i =0, i<4, i++) int i=0 never change, i< never change, only "4"changes

    // print 50 hello
    for(int i = 0; i <50; i++){ // i is for counting
      System.out.println("Hello");
    }
    // 0 - 100 print even no,
    for(int i=0; i<101; i++) { // special case, using i
      if (i%2 == 0) {
        System.out.println(i);
      }
    }
    // 0- 20  print odd number and the number >5
    for(int i =0; i<=20; i++) {
      if (i>5 && i%2 == 1 ){ // appears less goes first
          System.out.println(i);
      }
    }

    // leap year
    // divided by 100, not a leap year, unless divided by 400
    // divided by 4 is a leap year
    // 2000 is a leap year, 2100 is not a leap year, 2004 is a leap year
    int year =2100;
    boolean isLeapYear = false;
      if (year%4 == 0) {
        if(year%100 == 0){
          if (year %400 ==0) {
            isLeapYear = true; // 2000
          }
        }else{
              isLeapYear = true; // 2004
          }
      }System.out.println(isLeapYear);

      // second method
      isLeapYear = year%400 == 0 || (year %4 ==0 && year %100 != 0);
      System.out.println(isLeapYear);

      // sum up 1-100, 1+2+3+4+5...
      int total = 0;
      for( int i =0; i<=100; i++) {
        total += i;
      } System.out.println(total);
      
      // the number of values between 1-100, which is divided by 6
      int count =0;
      for (int i =1; i<=100; i++) { //if i =0, 1 extra time %6=0
        if (i%6 == 0) {
          count++;
        } 
      }System.out.println("the number of values between 1-100 and divided by 6:" +count);
      // i only use at for loop, never declares i as variable

      // convert 1-100 to char value, then concat them together
      String result = "";
      for(int i =1; i <= 100; i++) {
          result +=(char)i; // string + any type of value = string

      }System.out.println(result);




  }
}
