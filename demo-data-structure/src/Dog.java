import java.util.Objects;

public class Dog {
  private Dog dog;// 下一個
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  public void setNext(Dog nextdog) {
    this.dog = nextdog;
  }

  public Dog getNext() {
    return this.dog;
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    Dog d1 = new Dog("Peter");
    d1.setNext(new Dog("Sally"));
    d1.getNext().setNext(new Dog("Tommy"));
    d1.getNext().getNext().setNext(new Dog("David"));

    //System.out.println(d1.getNext().getNext().getName());

    // find the last dog (linkedList -> while)
    // 背pattern
    Dog head = d1; 
    while(head!= null) {
      System.out.println("dog=" + head.getName());
      head = head.getNext(); 
    }
  
    //remove the last dog
    head = d1;
    removeLastDog(d1);
  }
    
    public static void removeLastDog(Dog dog){
      if(dog ==null) return;  
      Dog head = dog;
      while(head.getNext() !=null){
          if(head.getNext().getNext() ==null) {
             head.setNext(null);
             break;
          }else{
            head=head.getNext();
          }
            
    }
    }
@Override
public boolean equals(Object o) {
  if(this == o) return true;
  if(!(o instanceof Dog))
    return false;
  Dog dog = (Dog) o;
  return Objects.equals(this.name, dog.name);
  
}
    public static void remove(Dog dog, Dog target) {
      Dog head = dog;
      while(head !=null) {
        if(head.equals(target)){// found the remove target
          if(head.getNext() != null) {
            dog =head.getNext();
            break;
          }
        head= head.getNext();
      }
      
    }

    

  

  

}
