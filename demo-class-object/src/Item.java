import java.math.BigDecimal;

public class Item {
  private double price;
  private double quantity;

  public Item(double price, double quantity) {
    this.price = price;
    this.quantity = quantity;
  }
  // setter 代表容許人地修改
  public double getPrice() {
    return this.price;
  }
  public double getQuantity() {
    return this.quantity;
  }
  public double amount() {
    return BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(this.quantity)).doubleValue();
  } 
  
  

  public static void main(String[] args) {
    Item rice = new Item(99.9,2);
    Item icecream = new Item(10.5, 6);


// order1.amount
Order o1 = new Order(1);
o1.add(rice);
o1.add(icecream);
System.out.println(o1.amount());// 262.8


  }
}
