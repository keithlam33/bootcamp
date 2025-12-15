// Java is safe 
public class Cat extends Animal {
    
    private String hair;

    
    public void setHair(String hair) {
      this.hair = hair;
    }
    public String getHair() {
      return this.hair;
    }
   


    public static void main(String[] args) {
      Cat c1 = new Cat();
      c1.setHair("Red");
      c1.setAge (10);
      c1.setName("Jenny");
      System.out.println(c1.getHair());
      System.out.println(c1.getAge());
      System.out.println(c1.getName());
      c1.eat();
      
    }
    //eat()
    //sound()
}
