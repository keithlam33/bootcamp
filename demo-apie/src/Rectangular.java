import java.math.BigDecimal;
import java.util.Objects;

public class Rectangular extends Shape {
  
private double length;
private double width;


public Rectangular(String color, double length, double width){
  super(color);
  this.length = length;
  this.width= width;
}
@Override
public double area() {
  return BigDecimal.valueOf(this.length)
        .multiply(BigDecimal.valueOf(this.width)).doubleValue();
}
@Override
public boolean equals(Object o) {
  if(this==o) return true;
  if(!(o instanceof Rectangular)) return false;
  Rectangular rectangular = (Rectangular)o;
  return rectangular.getLength() == this.length &&
        rectangular.getWidth() == this.width && 
       rectangular.getColor().equals(super.getColor());
}
@Override
public int hashCode() {
    return Objects.hash(this.length, this.width, super.getColor());
}
@Override 
public String toString() {
  return "Rectangular(" + "length="+this.length+
    ", width="+ this.width + "," + super.toString() +")";
}
public double getLength() {
  return this.length;
}
public double getWidth() {
  return this.width;
}

public static void main(String[] args) {
  Rectangular r1 = new Rectangular("RED", 5, 7);
  Rectangular r2 = new Rectangular("BLUE", 2, 10);
  Rectangular r3 = new Rectangular("YELLOW", 8, 4);
  Rectangular r4 = new Rectangular("RED", 5, 7);
  System.out.println(r1.area());
  System.out.println(r2.equals(r3));
  System.out.println(r4.hashCode() == r1.hashCode());
  System.out.println(r1);
  System.out.println(r3);
}



}
