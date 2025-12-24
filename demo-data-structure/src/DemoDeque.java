import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoDeque {// queue 做到 deque都做到 
  public static void main(String[] args) {
    Deque<Student> studentDeque = new LinkedList<>();
    studentDeque.add(new Student("Leo", 50));
    studentDeque.add(new Student("Sally", 10));
    studentDeque.add(new Student("Peter", 80));
    studentDeque.addLast(new Student("Steve", 70));
    studentDeque.addFirst(new Student("Oscar", 66));// 插隊 亦暗示緊要插隊 
    System.out.println(studentDeque.pollLast().getName());// queue 冇 
    System.out.println(studentDeque.peekLast());// queue 冇 
    Student target = null;
    while(!studentDeque.isEmpty()){
      if(studentDeque.peekFirst().getScore()> studentDeque.peekLast().getScore()){
         target = studentDeque.pollFirst();
    }else {
       target = studentDeque.pollLast();
    } System.out.println(target.getName());
  }

  // Queue - > FIFO
  // deque -> fifo/ lifo

  
  }
}
