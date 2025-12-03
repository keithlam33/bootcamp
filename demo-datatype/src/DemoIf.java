public class DemoIf {
  public static void main(String[] args) {
    int x = 10;
    if (x%2 == 0) {
      System.out.println("It is an even number.");
    } else{
      System.out.println("It is an odd number.");
    }
    if (x>0) {
      System.out.println("This is a positive number.");
    }
    if (x<0) {
      System.out.println("This is a negative number.");
    }

    // if x >3 and even number(condition), money + 10(result)
    // otherwise, money +5(result)
    int money = 0;
    if (x>3 && x%2==0) {
      money +=10;// result
    } else {
      money +=5;// result
    }
    System.out.println(money);

    
    // premium base $100
    // if female, above 40, 20% more premium
    // if male, smoker, 50% more premium
    // if female, smoker, 5% more premium
    // female / male, age >= 70, 40% more premium
    // char gender = 'M';
    boolean isFemale = false;
    boolean isSmoker = true;
    int age = 69;
    double pb = 100.0;
    double percentage =0;

    if (age > 40) {
      if (isFemale) {
        percentage += 20;
      }
      if (age>= 70) {
        percentage += 40;
      }
    } if (isSmoker) {
        if (isFemale) {
          percentage += 5;
        } else { // not female
          percentage += 50;
        }
      }
      double premium = pb * (1 +percentage/100);
    
    System.out.println(premium);
      // test cases: 
      // female age45 smoker, 25%
      // female 35 smoker, 5%
      // female 75 smoker,65%
      // male age69 smoker, 50%
      // male age70 smoker, 90% 
      // male age69 nonsmoker, 0%
      // m age70 nonsmoker, 40%
      // female age45 nonsmoker, 20%
      // female 35 nonsmoker, 0%
      // female 75 nonsmoker, 60%
      // give every case expected results before test 


      // else if

      // u divided by 3 -> money +3
      // u divided by 4 -> money +4
      // u divided by 5 -> money +5
      money = 100;
      int u = 15;
      if (u%3 == 0) {
        money +=3;
      }
      if (u%4 ==0) {
          money += 4;
        }
      if (u%5 ==0) {
          money +=5;
        }
        System.out.println(money);

        int score =75;
        char grade =' ';
        // >=90 grade A
        // >=80 <90 grade B
        // >=70 <90 grade C
        // otherwise grade F
        if (score >=90) {
          grade = 'A';
        }else if (score >=80) { // no need <90 because previous step failed
          grade ='B';
        }else if (score >=70 ) { // no need <80 because failed previously
          grade = 'C';
        }else {
          grade ='F';
        }
        System.out.println(grade);
        // second try
        // char grade ='F'; // everyone got grade skipping the else step
        // but readibility decreased and if there are more conditions

        //String method
        String name = "John";
        if ("John".equals(name)) { 
          System.out.println("he is John.");
        } else {
          System.out.println("he is not John.");
        }
        // charAt
        // char firstchar = name.charAt(0);
        if (name.charAt(0) == 'J') {
          System.out.println("Name starts with J");
        } else{
          System.out.println("it is not J");
        }

        if (name.startsWith("J")) {
          System.out.println("name starts with J");
        }else {
          System.out.println("it is not starts with J");
        }

        if (name.contains("J")) {
          System.out.println("contains John");
        } else {
          System.out.println("not contains John");
        }

        if (name.length()>3) {
          System.out.println("It is longer than 3");
        } else {
          System.out.println("it is too short");
        }

        // 2. switch
        // usually equals string or char
        // only =, cant use range>= <=
        // remember break
        // grade A -> 100
        // grade B -> 50
        // grade C -> 20 
        // otherwise -> No money received 
        money =0;
        grade ='B';

        switch (grade){
          case 'A':
            money +=100;
            break;// stop the case if fulfilled, manually add 
          case 'B':
            money +=50;
            break;// if not add break; result will continue add to 70
          case 'C':
            money +=20;
             break;
          //case 'D':
            //money+=500;
          default: // else
        }
        System.out.println(money);

      
        switch(name) {
          case"Jonn":
            System.out.println("He is Jonn");
            break;
          case"Jann":
            System.out.println("He is Jahn");
            break;
          case "John":
            System.out.println("He is John");
            break;
          case "Jehn":
            System.out.println("He is Jehn");
        }
        
        int pow = 3;
        int base = 2;
        switch(pow-1) {
          case 3:
            base *= 2;
          case 2:
            base *=2;
          case 1:
          base *= 2;
          default:
            break;
        } System.out.println(base);







  }
}
