public class Cat {
  // attributes
  private String name;
  private int age;
  
  // implicitly exist constructor 不寫都存在
  //more than one constructor
  // constructor: the process of building the object 
  public Cat() {}

  // instance method (method 跟object)第一人稱
  public void setName(String x) {
    this.name = x;// setName （功能）this.name -> my name
  }
  public String getName() {
    return this.name;
  }
  //setAge, and getAge
  public void setAge(int y) {
    this.age = y;
  }
  public int getAge() {
    return this.age;
  }
  public String isAdult() {
    double catage= this.age;
    if(catage >=18) {
      return "Adult.";
    }else {
      return "not an adult.";
    }
  }

  public static void main(String[] args) {
    // "new" -> calling constructor "Cat()" -> create cat object
    Cat c1 = new Cat(); // name and age
    c1.setName("John");
    c1.setAge(18);
    System.out.println(c1.getName()+ " "+ c1.getAge()+ " "+ c1.isAdult());// John  18

    Cat c10 = c1; // share same object addres
    c10.setName("Peter");
    c10.setAge(81);
    System.out.println(c1.getName()+ " "+ c1.getAge()+ " "+ c1.isAdult());//c1 changed as well //Peter 81

    Cat c2 = new Cat();// name and age
    c2.setName("Jenny");
    c2.setAge(34);
    System.out.println(c2.getName() + " "+ c2.getAge()+ " "+ c2.isAdult());//Jenny 34
    Cat c12 = c2;
    c12.setName("Benny");
    c12.setAge(43);
    System.out.println(c2.getName()+ " "+ c2.getAge()+ " "+ c2.isAdult());// Benny 43

    Cat c3 = new Cat();
    c3.setName("John");
    c3.setAge(61);
    System.out.println(c3.getName()+ " "+ c3.getAge()+ " "+ c3.isAdult());//John 61
    Cat c13= c3;
    c13.setName("Luo");
    c13.setAge(16);
    System.out.println(c3.getName()+ " "+ c3.getAge()+ " "+ c3.isAdult()); //Luo 16 
    String s1 = new String();

    // excel row(new data), column (new attribute, age , phone, email...)
    // OOP: (c1.name, c1.age) -> similar to one row in excel
    // OOP: ()

    Cat[] cats = new Cat[3];
    cats[0]=c1;
    cats[1]=c2;
    cats[2] = c13;
    System.out.println(cats[0].getAge());
    System.out.println(cats[1].getName());
  }

}
