// child class
// child class constructor always calling parent contructor

import java.util.Objects;

public class Dog extends Animal {
    
  // constructor (name , age)from parent
  public Dog(String name, int age) {
    super(name, age);// calling another parent constructor
  }
  public Dog() { 
 // super(); //不寫＝寫左 calling parent empty constructor

  }
  // implicityly inherit parent's all instance method
  //eat()
  //sound()

  // 背後getname 在記憶體中做左 咩 
  @Override // check if the parent has this method
  public String getName(){
    System.out.println("Dog getName...");
    // super call parent class
    // vs this call self
    return super.getName();
  }

  @Override // override animal's eat()
  public void eat() {
    System.out.println("Dog is eating...");
    // 蓋寫 
  }
  @Override //背
  public boolean equals(Object o) {
    //step 1 
    if(o == this) return true;// same java object in memory
    //step 2 係咪狗
    if(!(o instanceof Dog)) return false;
    Dog dog = (Dog) o;// no risk after instanceof 
    // //指向dog object
    return dog.getName().equals(super.getName())
    && dog.getAge() == super.getAge();
  }

  @Override 
  public int hashCode() { // generate an int value based on given value(s)
    return Objects.hash(super.getName(), super.getAge());
  }


  @Override
  public String toString() {
    return "Circle(" + super.toString() + ")";
  }

public static void main(String[] args) {
  Dog d1 = new Dog();
  d1.setName("John");
  d1.setAge(4);
  System.out.println(d1.getName());
  System.out.println(d1.getAge());

  Dog d2 = new Dog();
  d2.setName("Peter");
  d2.setAge(10);
  System.out.println(d2.getName());
  System.out.println(d2.getAge());
  d2.eat();

  Dog d3 = new Dog("Steven", 2);// after construction
  System.out.println(d3.getName());

}

    
}
