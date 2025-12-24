import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

    public class Cat {
      public static int idCount;
    private String name;
    private int id;
    

    public Cat(String name) {
      this.name=name;
      this.id=++Cat.idCount;
      
    }

    public String getName() {
      return this.name;
    }
    @Override
    public String toString() {
      return "Cat(" + "name="+ this.name+ ")";
    }
    
    @Override
    public boolean equals(Object o) {
      if(this == o) return true;
      if( !(o instanceof Cat )) return false;
      Cat cat= (Cat) o;
      return Objects.equals(this.name, cat.getName()); 
    }
    
    public static void main(String[] args) {
    // ArrayList of Cat
    // add, remove 
    ArrayList<Cat> cats = new ArrayList<>();
    cats.add(new Cat("Po"));
    cats.add(new Cat("John"));
    Cat c1 = new Cat("Nancy");
      cats.add(c1);
    
    
    cats.remove(new Cat("John"));
    System.out.println(cats.size());
    cats.remove(c1);
    System.out.println(cats.size());
    
    // array has ordering
    cats.add(new Cat("Peter"));// add to last
    cats.addFirst(new Cat("Jenny"));// add at first
    System.out.println(cats);

    cats.clear();
    System.out.println(cats);// empty
    System.out.println(cats.size());

    if(cats.contains(new Cat("Peter"))){ // loop and break
         System.out.println("contains Peter");
    }else {
      System.out.println("does not contains Peter");

    }

    if(cats.isEmpty()) {// array.length
         System.out.println("There is no cat");
    }else { 
         System.out.println(">= 1 cat. ");
   }

   // polymorphism
   List<Cat> catList = new ArrayList<>();
   

   }
}
