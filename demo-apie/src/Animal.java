// abstract class
//1 cannot be used for create object
//2 treat it as parent class
//3 has attributes 
    public abstract class Animal {// parent class
      // cat extends Animal, Animal implicitly extends object
    private String name;
    private int age;
    
    
    public Animal(String name, int age) {
      this.name = name;
      this.age =age;
    }
    public String getName() {
      return this.name;
    }
    public int getAge() {
      return this.age;
    }
    public void setName(String name) {
      this.name = name;
    }
    public void setAge(int age){
      this.age = age;
    }
     public void eat() {
      System.out.println("Animal eat...");
    }

    @Override
    public String toString() {
      return "Animal(" + "name="+ this.name
      + ",age" +this.age + ")";
    }
  public static void main(String[] args) {
    

    // new Animal();
  }
}
