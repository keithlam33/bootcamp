import java.math.BigDecimal;
import java.util.Objects;

public class Circle extends Shape{// final class means cannot be extend 不會再有circle's child class
  private double radius;


  public Circle ( double radius, String color) {
    super(color);
    this.radius = radius;
  }
  

  public double getRadius() {
    return this.radius;
  }
  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius)
          .multiply(BigDecimal.valueOf(this.radius))
          .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }
  @Override // this (super) vs o (circle)
  public boolean equals(Object o) {
    if(o==this) return true;
    if(!(o instanceof Circle)) return false;
    Circle circle = (Circle) o;
    return circle.getRadius() == this.radius && 
    //circle.getColor().equals(super.getColor());
    super.equals(circle);
  } 

  @Override 
  public int hashCode() {
    return Objects.hash(this.radius, super.getColor());
  }
  @Override
  public String toString() {
    return "Circle(radius="+this.radius +","+ super.toString() + ")";
  }
  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, "RED");
    Circle c2 = new Circle(3.5, "RED");

    System.out.println(c1.area());
    System.out.println(c1.equals(c2));
    System.out.println(c1.hashCode()== c2.hashCode());
    System.out.println(c1);
    System.out.println(c2);

    Circle c3 = new Circle(3.5, "BLUE");
    System.out.println(c1.equals(c3)); // false
    
  }
}
