public class DemoObject {
  public static void main(String[] args) {
    // Object.class 
    // 用自己方式形容世界
  //String.class ("John" ->"John")
  // String.class author override equals()

  String s = "hello";
  Dog d1 = new Dog("Kenny", 1); //both are two different java object in memory
  Dog d2 = new Dog("Kenny", 1);
  System.out.println(d1.equals(d2));// false before override
  //all java object implicitly extends object class
  
    // toString(), equals(), hashCode()
    //before override
    System.out.println(d1.toString()); //Dog@4e25154f
    System.out.println(d1.hashCode());//1311053135
        System.out.println(d1.hashCode() == d2.hashCode()); // false

    // result: java object in memory

    // after override
    System.out.println(d1.equals(d2));// true
    System.out.println(d1.hashCode() == d2.hashCode());// true
    System.out.println(d1);// Dog(Animal(name=Kenny,age1))
  }
}
