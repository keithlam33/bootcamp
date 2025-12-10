import java.math.BigDecimal;

public class Circle {
  // attributes
  // raw data
  private double radius;
  public Circle() {

  }
  public Circle(double radius) {
    this.radius = radius;
  }
  //private double area; not raw data, repeat with radius, if radius changes, manually change area
  // Instance (object) Methods
  public void setRadius( double radius) {
    this.radius = radius;
  }
  public double getRadius() {
    return this.radius;
  }
  // method -> presentation手段
  // circle's area is a presentation of radius
  public double area(){
    return BigDecimal.valueOf(this.radius)//
    .multiply(BigDecimal.valueOf(this.radius)) // 
    .multiply(BigDecimal.valueOf(Math.PI))//
    .doubleValue();// 38.48451000647496
  }
  public boolean isTooBig() {
    return this.area()>=40;
  }
  public static void main(String[] args) {
    System.out.println(Math.PI);
    

    Circle c1 = new Circle();// step of create object 
    System.out.println(c1.getRadius());// 0.0 default
    c1.setRadius(3.5);
    System.out.println(c1.getRadius());
    System.out.println(c1.area()); // 38.48451000647496

    Circle c2 = new Circle(3.9);
    System.out.println(c2.getRadius());
    System.out.println(c2.area());

    // why not double c1Area =c1.getRadius()*.....
    // bad presentation, 

  }
}
