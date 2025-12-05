public class DemoLoop2 {
  public static void main(String[] args) {
    // print 3 hello
    for(int i=0; i< 3; i++) {
    System.out.println("hello");
    }
    // print 1-10
    for (int i=0; i<=10; i++){
      System.out.println(i);
    }

    //name = "Mary", print every character
    String name = "Mary";
    for(int i=0; i< name.length(); i++) {
        System.out.println(name.charAt(i));
    }
    // principal= 1000.0, interest 3% per year, calculate the total amount after 3 years
    double principal = 1000;
    double interest = 3;
     // different from principal, better create extra variable
    for( int i =0; i<3; i++) {
        principal *= (1+interest/100);
        
    }double finalAmount = principal;
    System.out.println("Amount after 3 years=" + finalAmount);
    // 1 -20, sum up all odd number numbers and sum up all even number seperately, 
    // find the product of them * together
    int totalodd = 0;
    int totaleven = 0;
    for (int i =1; i<=20; i++) {
        if (i %2 == 1) {
           totalodd += i;
        }else {
           totaleven +=i;
        }
    } // outside loop
    int productofall = totalodd*totaleven;
    System.out.println("odd number total:" + totalodd);
    System.out.println("even number total:" +totaleven);
    System.out.println("the product of them:"+ productofall);

    // print "1/2/3/4/5"
    int n =5;
    String result = "";
    for(int i =1; i<=n; i++) {
        result += i;
        if (i<n) {
          result += "/";
        }
    }System.out.println(result);
    
    

    // "llello" count the number of l
    String l1= "llello";
    char target ='l';
    int count = 0;
    for (int i=0; i <l1.length(); i++) {
        if(l1.charAt(i) == target){ // if never =, use == , and char '' not ""
        // if string, use equal
            count++;
        } 
    }System.out.println("The number of " + target + " is "+ count);

    // "HeLLo", count the number of upper case letter
    String hello = "HeLLo";
    count = 0;
    for (int i =0; i<hello.length(); i++) {
      if (hello.charAt(i) >= 'A' && hello.charAt(i)<= 'Z') {
          count++;
      }
    }System.out.println("The number of Capital letters is" + count);


    // print 1 4 9 16 25 ... 100
      for(int i =1; i<=10; i++){
        System.out.println(i*i);
      }

    // given a string "apple", count the number of character a,e,i,o,u
      String l3 = "apple";
      count =0;
      for(int i =0; i< l3.length(); i++) {
          if (l3.charAt(i)== 'a' || l3.charAt(i)=='e' || l3.charAt(i)== 'i' 
          || l3.charAt(i)=='o' || l3.charAt(i)=='u') {
              count++;
          }
      }System.out.println(count);

      // given a string "hello", print "hello", "hell", "hel", "he", "h"
      String l4 = "hello";
      for( int i=0; i< l4.length(); i++){
             System.out.println(l4.substring(0, l4.length()-i ));
             //substring(0, 5 -0) hello
      }
      // given password = "abcd@1234XYZ"
      // check if the password is valid. result is boolean
      // 1 length >= 12
      // 2 with at least one capital letter
      // 3 with at least one special character @*!#
      String password = "abcd@1234XYZ";
      boolean isLengthValid = password.length()>=12;
      boolean withCapital = false;
      boolean withSpecialchar = false;
      for (int i=0; i< password.length(); i++){
          if (password.charAt(i)>='A' && password.charAt(i)<='Z' ) {
            withCapital = true;
          }
          if (password.charAt(i)=='@' || password.charAt(i)== '#'|| 
          password.charAt(i)== '$'|| password.charAt(i)== '!'||password.charAt(i)== '.') {
            withSpecialchar = true;
          }
          if (withSpecialchar && withCapital) {
            break;
          }
        }
          boolean isPasswordvalid= isLengthValid && withCapital && withSpecialchar;
          System.out.println("is Password Valid?" + isPasswordvalid);
          
      
      
  // given a string s1 = "abc5uk20fs", move all numbers to another string
  // s2 "520"
  String s1 = "abc5uk20fs";
  String s2 = "";

  for(int i=0; i<s1.length(); i++) {
     if (s1.charAt(i)>= '0' && s1.charAt(i)<= '9')
      {
        s2 += s1.charAt(i);
      }
  }System.out.println(s2);

  //encrypt password, "abcd" -> algorithm: ascii +3 -> "defg"
  // 'a' + 3 = char +int = int
  String origpassword= "abcd";
  String encryptpassword = "";
      for(int i=0; i< origpassword.length(); i++) {
          encryptpassword += (char)(origpassword.charAt(i)+3);
          // string =string + char c= (char)(int number)
          // int number = charAt +3 (char +int )
      }System.out.println(encryptpassword);

     // break exit earlier
     // the first number between 1- 50, which is divided by 7
     int target1 = -1; // add target as if the operation could
     for ( int i=1; i<=50; i++) {
        if (i%7 == 0) {
          target1 = i;
          break;// break loop 
        }
     }if (target1 == -1) {
        System.out.println("Not Found.");
     }else {
      System.out.println("Target=" + target1);
     }

     //continue -> skip the rest
     // same as else, but when there are 10000 lines, else is hard to read
     for( int i=0; i<20; i++) {
      if (i%2 ==0) {
        System.out.println("hello");
        continue;// goes to modifier (i++)
      }
      System.out.println("goodbye");
     }

     // find the largest number <1000, divided by 7
     for(int i =1000;i >1; i--) { // i--
        if (i%7 == 0) {
          System.out.println(i);
          break;
        }
     }
     int largestNum= 0; // without break
     for(int i= 0; i<1000; i+=7) { 
      largestNum = i;
      }System.out.println(largestNum);
     // while loop
     largestNum = 0;
     while (true) { // 只要 true 就一直跑 → 代表「永遠執行」
      if (largestNum +7>=1000) {//  until if >100 and divided by 7, stop
        break;
      }
      largestNum +=7; //不然就一直加7
     }
     System.out.println(largestNum);

     // 
     String currentTime = "23:42:00";
     int secondToAdd = 6500;

     // charAt a num '2' ascii:50, solution: '2'-'0'= 2 fixed distance
     // string to int
     int chour = (currentTime.charAt(0)-'0')*10 +(currentTime.charAt(1)-'0');
     int cmin = (currentTime.charAt(3)-'0')*10 +(currentTime.charAt(4)-'0');
     int csecond= (currentTime.charAt(6)-'0')*10 +(currentTime.charAt(7)-'0');
     int ctimeinsecond = chour*60*60 + cmin *60+csecond;// convert all to second
     
     int todaytotalsecond= (ctimeinsecond + secondToAdd) %(24*60*60);
     System.out.println(todaytotalsecond);// 5420

     int todayhour = todaytotalsecond /(60*60);// prefix 0
     int todaymin =  todaytotalsecond %(60*60)/60; // % remainder, prefix 0
     int todaysec =  todaytotalsecond %(60*60)%60; // prefix

     String todayhourinstring = (todayhour <10?"0": "")+todayhour;
     String todaymininstring = (todaymin <10?"0": "") +todaymin;
     String todaysecinstring = (todaysec <10?"0": "")+todaysec;

     String todayTime = todayhourinstring +":"+ todaymininstring +":"+ todaysecinstring;
     System.out.println(todayTime);
     
     //keep double a given number, until it >10000. find number
     int n1=9;
     int target2 = n1;
     while (true) {
        if ((target2*=2) >10000) {
        break;
        } target2*= 2;
     }System.out.println(target2);

     while (target2 <=10000) {
      target2 *= 2;
     }System.out.println(target2);


     // find the index of 'X', -1 is not found
     // not using indexOf, use loop
     

     String s10= "HELLOXWORLD";
     int i10=0;
     while (i10 < s10.length() && s10.charAt(i10) != 'X') {
        i10++; 
        }if(i10< s10.length()){ 
          System.out.println(i10);
        } else {
          System.out.println("Not Found");
        }

        int i13 = -1;
        for(int i =0; i <s10.length(); i++ ) {
            if(s10.charAt(i) == 'X') {
                i13 = i;
                break;
            }
        }System.out.println(i13);

        // check if the number is a prime or not
    int number = 0; //true
    boolean isPrime= true;
    if(number>=2) { 
     for(int i=2; i< number; i++) { 
    if (number %i==0) {
        isPrime = false;
        break;
        }
      }     
    }else {
  isPrime = false;
      }
        if (isPrime) {
          System.out.println("the number " + number +" is a prime.");
    } else {
        System.out.println("the number " + number + " is not a prime");
      }


        

        // for(i for(j ) )i and j refers to 2 different things
        // 
        for( int i=0; i<3; i++) {//outer loop
          for (int j=0; j<3; j++) {// inner loop
            System.out.println("i="+i + "j=" +j);
          }
        }
        int k=4;
        for(int i=0; i<k; i++){// row 
          for(int j=0; j<i+1; j++) { // print star 
            
            System.out.print("*");
          }
          System.out.println();//next row
        }
        
        //   *
        //  ***
        // *****
        //int k1 = 3;
        //or(int i=0; i<k; i++) {
          //for(int j=0; j<i) {

          //}
        //}
          
        
        
        


     
     
     

      


     
     
     


  }
}
