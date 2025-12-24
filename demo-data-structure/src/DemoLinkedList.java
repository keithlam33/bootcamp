import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class DemoLinkedList {
  // java linkedlist: 兩頭 double linkedlist


  public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<>();
    names.add("John");
    names.add("Sally");
    names.add("Leo");

    System.out.println(names.size());
    names.remove("John");
    System.out.println(names);
    System.out.println(names.contains("Sally"));
    System.out.println(names.isEmpty());
    System.out.println(names.size());

    // java arraylist Linkedlist
    // linkedlist 頭尾 加減 快不用copy array
    // arraylist performance 不差
    // address

    //get index
    System.out.println(names.get(1));//leo
    // arraylist get() -> performance good -> O(1)
    // Linkedlist get() -> performance not good ->O(n)

    // polymorphism (compile time and run time)
    // compile time (static ) object reference決定 what有咩method 可以 call 
    // dynamic runtime Object reference 指住object 決定how to call
    List<String> emails = new ArrayList<>(); //自由切換 左邊指list 右邊可以用 arraylist linkedlist vector(Stack)
    emails.add("to@gmail.com");// object reference ->list, run time use arraylist method
    
    emails = new LinkedList<>();
    emails.add("to@gmail.com");// object reference -> list, but run time use linkedlist 

    emails = new Vector<>();
    emails = new Stack<>();

    Set<Integer> integers= new HashSet<>();// duplicate 
    integers.add(45);
    integers.add(45);
    System.out.println(integers.size());

    //arraylist and linkedlist constructor 不同 , add時方式路不同 

  }
}
