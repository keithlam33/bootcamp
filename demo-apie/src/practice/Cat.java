package practice;

public class Cat extends Animal {
  
  @Override
  public void eat() {
    System.out.println("Cat is eating");
  }
  @Override
  public void sleep() {
    System.out.println("Cat is sleeping");
    super.sleep();
  }

  public static void main(String[] args) {
    // static Polymorphism
    Object o = new Cat();
    // o.eat(); compile time 
    Animal a = new Cat();
    a.eat();

    // Dynamic Polymorphism run time calling cat object method
    a.sleep();// Cat is sleeping

    // Animal[] animals = new Cat[3]; // not make sense
    // animals[0] = new Cat();
    // animals[1] = new Dog();
    // compile time no error, run time error!!
    Animal[] animals = new Animal[3];
    animals[0] = new Cat();
    animals[1] = new Dog();

    // Polymorphism + Downcasting
    Object[] objects = new Object[2];
    objects[0] = new Warrior();
    objects[1] = new Dog();
    for(Object obj : objects) {
        if(obj instanceof Dog) {
          Dog dog = (Dog)obj;
          dog.sleep();
        }else if (obj instanceof Warrior) {
          Warrior warrior = (Warrior)obj;
          warrior.attack(warrior);
        }// 但呢段不oop 為什麼dog 跟warrior 放在一起 是歸納在Object[]時出錯
        // for loop should be 有關係
        
    }



  }
}
