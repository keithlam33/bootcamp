// class : one to many relation
//自己定的
//Customer = 人（一個人可以有很多錢包）
//Order = 錢包（每個錢包有自己的 id）

import java.math.BigDecimal;

public class Customer {
  private Order[] orders;//告訴 Java：「Customer 擁有 Order 的陣列！

  public Customer() {
    this.orders = new Order[0]; 
    //「沒有訂單」用 new Order[0] 來表示，而不是 null
  }


  public void add (Order newOrder) {
    Order[] newOrders = new Order[this.orders.length +1];//
    // create newOrders new array 長一格
    //this.orders.length + 1新陣列要多大？
    //if this.order[] 有2張單 
    // newOrders 執行後就會變3個空array 
    for( int i=0; i<this.orders.length; i++) {// looping old array
        newOrders[i] = this.orders[i];
        // copy original array element to new array
    }
    newOrders[newOrders.length -1] = newOrder;
    // put neworder in the end of array
    this.orders = newOrders; 
    // assign the new array object to object reference
  }
  // method signature: method name + parameters
  public Order getOrder( int orderId) {
    for( Order o : this.orders) {
      if(o.getId() == orderId){
        return o;
      }
    }
    return null;
  }

  // VIP total order amount >100000
  public boolean isVip() {
    BigDecimal total = BigDecimal.ZERO;
    for (Order order : this.orders) {
      total = total.add(BigDecimal.valueOf(order.amount()));
    }
    return total.doubleValue() >= 100_000;
  }
  public double getOrderAmount(int orderId) {
      for(Order o : this.orders) {
        if(o.getId() == orderId) {
            return o.amount();
        }
      }return 0.0;
  }

  public static void main(String[] args) {
 
  }
}
