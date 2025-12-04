public class stringif {
  public static void main(String[] args) {
    // week 1 03/12 for loop, string
      
    String s= "firstweekpractice";
     // length()幾長
    System.out.println(s.length()); // 17
    //indexOf(" ")
    System.out.println(s.indexOf("k")); // find k position, result:8, 9th posi.
    //charAt( )找在第x位置的字
    System.out.println(s.charAt(8)); // k
    //find first char
    System.out.println(s.charAt(0)); // f
    // how about last char
    System.out.println(s.charAt(s.length()-1));// length:17 -1=16 for charAt to take last
    // equals(" ")出boolean 是否等於
    System.out.println(s.equals("firstweekpractice"));// true
    System.out.println(s.equals("goodbye"));// false
    System.out.println(s.equalsIgnoreCase("FIRSTWEEKPRACTICE"));// no matter capital or small letter
    // contains()出boolean 是否有 ""
    System.out.println(s.contains("weekprac"));// true
    System.out.println(s.contains("hodsa"));// false
    // isEmpty 有space 都不是empty vs isBlank 自動scan到space as blank
    String emptystring="";
    String spacestring=" ";
    System.out.println(emptystring.isEmpty());//true
    System.out.println(spacestring.isEmpty());//false, with space
    System.out.println(emptystring.isBlank());//true
    System.out.println(spacestring.isBlank());//true
    // replace( "xx", "yy")xxto yy 
    System.out.println(s.replace("ee", "aa"));// firstwaakpractice
    // startsWith()第一字是否
    System.out.println(s.startsWith("good"));// false
    //endsWith() 出boolean 最後字是否
    System.out.println(s.endsWith("bye"));// false
    // indexOf() find repeated word 找字的位置
    System.out.println(s.indexOf("e"));// 6, 7th posi.
    System.out.println(s.lastIndexOf("e"));// 16, 17th pos.
    // concat() 加埋一齊
    System.out.println(s.concat("!!!!"));
    //substring() 攞字
    System.out.println(s.substring(8));// kpractice
    System.out.println(s.substring(8, 17));// kpractice 8 is 9th, 17 is 17th posi.
    // toUpperCase & toLowerCase 轉大細
    System.out.println(s.toUpperCase()); // FIRSTWEEKPRACTICE
    System.out.println("ADDOIL".toLowerCase());// add oil
    // trim() cut頭尾
    System.out.println("   first week.   ".trim());// cut space at head and tail
    System.out.println("   first week.   ".trim().length());// 12
    System.out.println("  programming.  ".trim().substring(3, 7));//gram

    // IF practice 
    int x = 10;
    int money = 0;
     //case: if x>6, and is even number, money+5
    if (x>6) {
      if (x%2 == 0) {
        money += 5;
      }
    }System.out.println(money);// 5

    // case loop, from 1-100, an even number, money +4
   for(int i= 1; i <=100; i++) {
      if (i%2 == 0) {
        money += 4;
      }
    }System.out.println(money);

  //premium base = 1000
   //if male, >= 40, 25% more pb
   // if male, smoker, 30% more
   //if female, smoker, 10% more
   // if male or female, >= 65, 40% more
   double pb = 1000;
   boolean isMale = false;
   boolean isSmoker = true;
   int age = 65;
   if (isMale) {
      if (isSmoker) {
        pb *= 1.3;
      }
      if (age >=50) {
        pb *= 1.25;
      }
   }else if(isSmoker){ // only else if usage as either is or nota smoker
      pb *= 1.1;

   }if (age >= 65) {
      pb *=1.4;
   }System.out.println(pb);
   // second same case but % +%
   double percentage= 0;
   double pb1 = 1000;
   if (age >=40) {
    if (isMale) {
      percentage += 25;
    }
   }if (age >=65) {
    percentage += 40;
   }
   if (isSmoker) {
    if (isMale) {
      percentage += 30;
    }else { // only else usage in this case as either is smoker or not
      percentage += 10;
    }
   }System.out.println(pb1*(1+percentage/100));
   //else if 
   // divided by 4,5,6, money +4,5,6,
   int money1 = 0;
   int u = 50;
   if (u%4 == 0) {
    money1 +=4;
   } if (u%5 == 0) {
    money1 += 5;
   }if (u%6 == 0) {
    money1 += 6;
   }System.out.println(money1); // a case cant use else if as there are overlaps
   // else if case
   // >=90 grade a
   // >=75 grade b
   // >=60 grade c
   // else failed
   int score =77;
   char grade = ' ';
   if (score>=90) {
    grade = 'A';
   }else if (score >=75) {
    grade = 'B';
   }else if (score >=60) {
    grade ='C';
   }else {
    grade = 'F';
   }System.out.println(grade);

   int money2 =0;
   switch (grade) { // switch only use in equals, cant be used in range
    case 'A':
      money2+= 100;
      break;
      case 'B':
      money2 +=50;
      break;
      case'C':
      money2 += 20;
      break;
    default:
   }System.out.println(money2);



    
  }
}


