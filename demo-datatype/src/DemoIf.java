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

    // char gender = 'M';
    boolean isFemale = true;
    boolean isSmoker = true;
    int age = 71;
    double pb = 100;

    // premium base $100
    // if female, above 40, 20% more premium
    // if male, smoker, 50% more premium
    // if female, smoker, 5% more premium
    // female / male, age >= 70, 40% more premium

    if (!isFemale) {
      if (age>40) {
        pb= 100*1.2;
        if (isSmoker) {
          pb=100*1.25;
          
        }
      }if (isSmoker) {
        pb=100*1.05;
      }if (age>70) {
        pb = 100*1.6;
      }
    } else {
      if (isSmoker) {
        pb=100*1.05;
        if (age>70) {
          pb=100*1.45;
        }
      }
      if (age>70) {
        pb= 100*1.4;
      }
    }
    System.out.println(pb);


  }
}
