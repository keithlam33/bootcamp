import java.math.BigDecimal;

public class Order {
   private int id;//Order 有自己的 id
   private Item[] items;

  // give up empty constructor
   public Order(int id) {
    this.id=id;
    this.items = new Item[0];
  } // this means only one way and Order must requires id
  //每筆訂單都有自己的「身分證號碼」
  //強制一定要給 id 才能建立訂單
  //讓別人可以問：「你的身分證號碼是多少？」
  public int getId() {
    return this.id;
  }
  public double amount() {
    BigDecimal total = BigDecimal.ZERO; // 0
    for( Item item: this.items) {
      total = total.add(BigDecimal.valueOf(item.amount()));
    }
    return total. doubleValue();
  }
  public void clear(){
    this.items = new Item[0];
  }
  // setItems() 衝突 add
  public void add(Item newitem){
    Item[] newitems = new Item[this.items.length +1];
    for(int i =0; i<this.items.length; i++){
      newitems[i] = this.items[i];
    }
    newitems[newitems.length-1] = newitem;
    this.items=newitems;
  }
  public static void main(String[] args) {
    Order o1 = new Order(1);// 建立訂單，id=1
    Order o2 = new Order(2);// 建立訂單，id=2
    Customer c1 = new Customer();
    c1.add(o1);// loop
    c1.add(o2);// loop
    System.out.println(c1.getOrder(1).getId());
  }
}
