import java.util.Objects;

public abstract class Shape {
  private String color;
  
  public Shape(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }
  @Override
  public boolean equals(Object o) {
    if(this ==o) return true;
    if(!(o instanceof Shape))return false;
    Shape shape = (Shape) o;
    //return shape.getColor().equals(this.color);
    return Objects.equals(shape.getColor(), this.color);
    // Objects.equals (xx,yy) 自動 ==/ equals
    //java 8
  }
  
  @Override
  public String toString() {
    return "color=" + this.color+ ")";
  }
  @Override
  public int hashCode() {
    return Objects.hash(this.color);
  }
  

  // abstract method (without implemention)
  // child class MUST implement all abstract method
  abstract double area();// 通常不加public
  // in other words, if the child is not able to implement abstract method
  // implies that it is not a shape 
  // 如果係shape 應該有area
  // 不必要 如果唔寫abstract method, child class 不用加override
}
