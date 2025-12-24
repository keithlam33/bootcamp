public class Superman extends Human implements Flyable {
  // compile time confirm the object can fly
  // implements 合約
  
  
static {
  System.out.println("Superman static block");
}
  
  public Superman(String name) {
    super(name);
    System.out.println("superman constructor");
  }
  // compile time : grammar
  // run time 
  //點樣飛 
  @Override
  public void fly() {
  }

  public static void main(String[] args) {
    //jvm -> enum -> static block execution -> main()
    // new Superman("ken").run();
    // new Superman("Steven").run();
    

  }
}
