import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Person implements Comparable<Person>{
  private int age;
  private Occupation occupation;

  public Person(int age, Occupation occupation) {
    this.age=age;
    this.occupation= occupation;
  }
  public Person(int age) {
    this.age=age;
  }
  public Occupation getOccupation() {
    return this.occupation;
  }
  public int getAge() {
    return this.age;
  }
  @Override // 再開一個sortedbyrule1
  public int compareTo(Person that){
  return this.age>that.getAge()? -1 : 1;
  }
  @Override
  public String toString() {
    return "Person("+"Age ="+ this.age+ ")";
  }
  public static enum Occupation{
    CLERK, PROGRAMMER, POLICEMAN,;
  }

  public static void main(String[] args) {
  // sort from large to small
    List<Person> persons = new ArrayList<>();
    persons.add(new Person(60));
    persons.add(new Person(70));  
    persons.add(new Person(66));  
    persons.add(new Person(65));  
    persons.add(new Person(80));  
    persons.add(new Person(60));  
    Collections.sort(persons);
    System.out.println(persons);

    PriorityQueue<Person> personQueue = new PriorityQueue<>(persons);
    System.out.println(personQueue.poll());// compareTo -> sorting
    System.out.println(personQueue.poll());// compareTo
    System.out.println(personQueue.poll());// compareTo
    System.out.println(personQueue.poll());// compareTo
    personQueue.add(new Person(89));
    System.out.println(personQueue);
    System.out.println(personQueue.poll());// compareTo
    System.out.println(personQueue.poll());// compareTo
    System.out.println(personQueue);
    System.out.println(persons);

    PriorityQueue<Person> personQueue2 = new PriorityQueue<>(new SortedByRule1());
    personQueue2.add(new Person(50, Person.Occupation.POLICEMAN));
    personQueue2.add(new Person(30, Person.Occupation.POLICEMAN));
    personQueue2.add(new Person(40, Person.Occupation.POLICEMAN));
    personQueue2.add(new Person(25, Person.Occupation.POLICEMAN));
    personQueue2.add(new Person(35, Person.Occupation.POLICEMAN));
    personQueue2.add(new Person(45, Person.Occupation.POLICEMAN));
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());

    ArrayList
    Collections.sort()

    
  
  }

}
