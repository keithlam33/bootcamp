public class JavaQuest2 {
  public static void main(String[] args) {
    
    int a = 10;
    if (a == 9) {
      System.out.println("a is equals to 9");
    }
    if (a>=0 && a<=8) {
      System.out.println("a is between 0 and 8");
    }else if (a >9) {
      System.out.println("a is bigger than 9");
    }
    // add condition to print "a is between 0 and 8"
    // how about a > 9?

    // Take a character and check whether it is:
    // 1. Vowel (a, e, i, o, u – both lowercase and uppercase)
    // 2. Consonant
    // 3. Not an alphabet
    char ch = 'i';
  
    if( ch== 'a'|| ch== 'e'|| ch== 'i'|| ch== 'o'||ch== 'u'|| ch== 'A'||
    ch== 'E'|| ch== 'I'|| ch== 'O'|| ch== 'U' ) {
      System.out.println("It is a vowel.");
    }else if(ch >='a' && ch<='z' || ch>='A' && ch <='Z') {
      System.out.println("It is a consonant.");
    }else {
      System.out.println("It is not an alphabet");
    }
     

    // Take salary and years of experience, then calculate bonus
    // Experience ≥ 10 years → 20% bonus
    // 5–9 years → 10% bonus
    // < 5 years → 5% bonus
    // Also, if salary > 100000, reduce bonus by half
    int exp = 12;
    int salary = 110_000;
    int bonus =0;
    if (exp >=10) {
        bonus = 20;
    }else if (exp >=5 && exp <=9) {
        bonus = 10;
    }else if(exp <5) {
        bonus = 5;
    }
    if (salary >100000) {
      bonus /=2;
    }
    System.out.println("Finalsalary is " + salary*(1+bonus/100.0));


  }
}
  
