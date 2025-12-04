public class loop {
  public static void main(String[] args) {
    // print 10 "loop"
    for(int i = 0; i< 10; i++){
      System.out.println("loop");
      // steps: i =0 <10, do the action then i+1, repeat
    }

    // 0-20 print even number
    for(int i=0; i <=20; i++){
        if (i%2 == 0) {
          System.out.println(i);
        }
    }
    //0-25 print odd number and number >7
    for(int i =0; i <=25; i++){
        if(i%2 == 1 && i>7){
          System.out.println(i);
        }
    }

  //leap year case
  // must can be divided by 4
  // can't be divided by 100, unless can divided by 400
  int year = 2100;
  boolean isLeapYear = false;
  if (year % 4 == 0) {
    if (year % 100 == 0) {
        if (year % 400 == 0) {
            isLeapYear = true;  // 2000
        }
        // else → 1900, 2100 → not leap
    } else {
        isLeapYear = true;      // 2024, 2028 → leap
    }System.out.println(isLeapYear);
  }
    // sum up 1- 20
    int total = 0;
    for(int i=1; i<=20; i++) {
      total+= i;
    }System.out.println(total);// 210

    //the numbers of value between 1-38, and divided by 4
    int count =0;
    for(int i =1; i <=38; i++){// remember in division care of "0"
        if(i%4 ==0){
            count++;
        }
    }System.out.println(count);


      // convert 1-100 to char value, then concat them together
      String c1 ="";
      for(int i=1; i<=100; i++){
         c1+= (char)i; // 置加 不斷自己加一樣野/一個數
      } System.out.println(c1);

  }
  }
