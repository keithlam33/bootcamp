import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  

public static void main(String[] args) {
  Queue<String> names = new PriorityQueue<>();
  names.add("John");
  names.add("Peter");
  names.add("Alex");

  System.out.println(names);// no order
  // ordering, when happening?
  // poll()先order sorting-> slow
  System.out.println(names.poll());
  System.out.println(names.poll());
  System.out.println(names.poll());
  names.add("Candy");
  System.out.println(names.poll());
  

}

}
