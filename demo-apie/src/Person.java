public class Person extends Human {
  private static final int FLY_SPEED ;
  private static final Superman leader;

  static{// static block -> each class only have 1 static block
    System.out.println("Person static block");
    FLY_SPEED=100;
    leader = new Superman("Ben");
  }
  public Person(String name) {
    super(name);

  }
  public static void main(String[] args) {
    
// System.out.println(Person.leader.getName());
// System.out.println(Person.FLY_SPEED);
// class loading -> run main 前run 埋其他class static block
  }
}
