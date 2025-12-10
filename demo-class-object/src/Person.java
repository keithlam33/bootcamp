import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height, weight
  private String name;
  private double height;
  private double weight;

  // void -> no return
  public void setName( String name) {
    this.name=name;
  }
  public String getName() {
    return this.name;
  }
  public void setHeight( double height) {
    this.height = height;
  }
  public double getHeight() {
    return this.height;
  }
  public void setWeight( double weight){
    this.weight=weight;
  }
  public double getWeight(){
    return this.weight;
  }
  public double bmi() {
      return BigDecimal.valueOf(this.weight)
      .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 1, RoundingMode.HALF_UP)
      .doubleValue();
  }
  public String bodyIndx(){
    double bmi = this.bmi();
    if(bmi <18.5) {
        return "Under Weight";
    } else if (bmi <25.0) {
        return "Normal Weight";
    }else if (bmi <30.0) {
        return "Over Weight";
    }else if (bmi <35.0) {
        return "Obese Type I";
    }else if (bmi <40.0) {
        return "Obese Type II";
    }else {
      return "Obese Type III";
    }
  }
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setName("John");
    p1.setHeight(1.7);
    p1.setWeight(60.6);
    System.out.println(p1.getName() +p1.getHeight() + " "+ p1.getWeight()+ " " + p1.bmi()+ " "+ p1.bodyIndx());
    

    Person p2 = new Person();
    p2.setName("Peter");
    p2.setHeight(1.81);
    p2.setWeight(90.3);
    System.out.println(p2.getName() +p2.getHeight() + " "+ p2.getWeight()+ " " + p2.bmi()+ " "+ p2.bodyIndx());

    Person p12 = p2;// share same object address
    p12.setName("Larry");
    p12.setHeight(1.83);
    p12.setWeight(90.8);
    System.out.println(p12.getName() + p12.getHeight() + " "+ p12.getWeight()+ " " + p12.bmi()+ " "+ p12.bodyIndx());

    Person[] persons = new Person[2];
    persons[0] = new Person();
    persons[1] = p1;
    System.out.println(persons[0].getHeight());
    System.out.println(persons[1].getHeight());
    System.out.println(p1.getHeight());
    //array [i] store address in each array to object
    persons[1].setWeight(60);
    System.out.println(p1.getWeight());// 60



  }

}
