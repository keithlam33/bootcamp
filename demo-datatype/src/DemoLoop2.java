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
    for( int i =0; i<3; i++) {
        principal *= (1+interest/100);
        System.out.println(principal);
    }
    // 1 -20, sum up all odd number numbers and sum up all even number seperately, 
    // find the product of them * together
    double totalodd = 0;
    double totaleven = 0;
    for (int i =1; i<=20; i++) {
        if (i %2 == 1) {
           totalodd += i;
        }if (i%2 == 0) {
           totaleven +=i;
        }
    }System.out.println("odd number total:" + totalodd);
    System.out.println("even number total:" +totaleven);
    System.out.println("the product of them:"+ (totalodd*totaleven));

    // print "1/2/3/4/5"
    
    

    // "llello" count the number of l
    String l1= "llello";
    double count = 0;
    for (int i=0; i <l1.length(); i++) {
        if(l1.charAt(i) == 'l'){ // == , and char '' not ""
            count++;
        } 
    }System.out.println(count);

    // "HeLLo", count the number of upper case letter
    

    // print 1 4 9 16 25 ... 100
      for(int i =1; i<=10; i++){
        System.out.println(i*i);
      }

    // given a string "apple", count the number of character a,e,i,o,u
      String l3 = "apple";
      int count2 = 0;
      for(int i =0; i< l3.length(); i++) {
          if (l3.charAt(i)== 'a' || l3.charAt(i)=='e' || l3.charAt(i)== 'i' || l3.charAt(i)=='o' || l3.charAt(i)=='u') {
              count2++;
          }
      }System.out.println(count2);

      // given a string "hello", print "hello", "hell", "hel", "he", "h"
      String l4 = "hello";
      
      for( int i=0; i< l4.length(); i++){
    
             System.out.println(l4.substring(0, l4.length()-i ));
      }
      // given password = "abcd@1234XYZ"
      // check if the password is valid. result is boolean
      // 1 length >= 12
      // 2 with at least one capital letter
      // 3 with at least one special character @*!#
      String password = "abcd@1234XYZ";
      boolean isValid = true;
      boolean isUpper = true;
      
  // given a string s1 = "abc5uk20fs", move all numbers to another string
  // s2 "520"
  String s1 = "abc5uk20fs";
  String s2 = "";

  for(int i=0; i<s1.length(); i++) {
     if (s1.charAt(i)== '5' ||s1.charAt(i)== '2' || s1.charAt(i)== '0')
      { char cs1 =s1.charAt(i);
        s2 += cs1;
      }
  }System.out.println(s2);

  //encrypt password, "abcd" -> algorithm: ascii +3 -> "defg"
  String p1 = "abcd";
  String ep1 = "";
      for(int i=0; i< p1.length(); i++) {
          char c1= p1.charAt(i);
          ep1 += (char)(c1+3);
          
      }System.out.println(ep1);

      char c2 ='a';
      int ic2 = c2;
      System.out.println(ic2);// 97 


  }
}
