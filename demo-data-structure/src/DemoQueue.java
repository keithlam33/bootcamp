import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
  
  public static void main(String[] args) {
    // priorityqueue -> queue
    // arrayqueue -> deque
    // linkedlist -> deque
    // ArrayDeque polymorphism
    
    // 留意 新 object 只能new 幾多個new 幾多個object
    // only have one object arraydeque
    // but we have 4 object references
    ArrayDeque<String> names = new ArrayDeque<>();
    Deque<String> namesDeque = names;
    Queue<String> namesQueue= names;
    Collection<String> namesCollection = names;
    // 要用最少的暴露去話比人知 collection->most parent less method
    // collection -> Queue -> Deque-> ArrayDeque

    // ArrayDeque<String> names = new ArrayDeque<>();
    // Deque<String> names2 = new ArrayDeque<>();
    // Queue<String> names3= new ArrayDeque<>();// hiding
    // Collection<String> names4 = new ArrayDeque<>();// hiding 
    //what are the differences
    namesDeque.poll();
    namesDeque.push("John"); // because deque 決定能用什麼method
    namesDeque.add("John");
    namesDeque.pollFirst();
    namesDeque.pollLast();

    namesQueue.poll();
    namesQueue.add("Sally");
    
    namesCollection.add("Leo");

    //Queue  排隊 
    Queue<Student> studentQueue = new LinkedList<>();//ArrayDeque<>();// array形式, 冇關 deque
    // 90% scenario -> use linkedlist for queue 排隊都係頭同尾
    studentQueue.add(new Student("Leo", 50));
    studentQueue.add(new Student("Sally", 10));
    studentQueue.add(new Student("Peter", 80));

    System.out.println(studentQueue.peek().getName());// 頭位邊個 peek // leo

    Student queueHead = studentQueue.poll();//remove first
    System.out.println(queueHead.getName());// leo removed

    System.out.println(studentQueue.peek().getName());// sally

    // queue string
    Queue<String> fruits = new LinkedList<>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("kiwi");
    fruits.add("banana");

    System.out.println(fruits.peek());
    System.out.println(fruits.size());
    System.out.println(fruits.contains("apple"));

    Queue<String> modifyFruits= new LinkedList<>(fruits);
    String fruit = modifyFruits.poll();
    System.out.println(fruit);//apple
    System.out.println(fruits);//[apple, orange, kiwi, banana]
    System.out.println(modifyFruits);//[orange, kiwi, banana]

    //queue loop -> consume(first in first out) only while loop
    // cant find 中間的 
    while(!fruits.isEmpty()) {
        String fruit2 = fruits.poll();
        System.out.println(fruit2);
    }
    System.out.println(fruits);// []

  }
}
