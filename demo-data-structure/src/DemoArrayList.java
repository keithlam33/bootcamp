import java.util.ArrayList;

public class DemoArrayList {


  public static void main(String[] args) {
    //array disadvantages:
    // fixed length 一開始就要set length
    int[] arr = new int[3];

    //data structure -> array and linked list (memory)
    // high level structure -> ArrayList
    // 痛點：add 一次 都會copy舊的去做新的array 如果有100萬個要add 就會慢
    ArrayList<String> names = new ArrayList<>();// constructor
    names.add("John");
    names.add("Steve");
    names.add("Mary");
    names.add(new String("Mary"));
    System.out.println(names);// arraylist.toString()自動to string
    // [John, Steve, Mary]

    ArrayList<Integer> scores = new ArrayList<>();
    scores.add(83);
    scores.add(25);
    scores.add(100);
    System.out.println(scores);// [83,25,100]
    // open class (name and score) 
    // john 83 對應返 

    // 2 remove() (equals, remove the first element(break))
    names.remove("Mary");// remove() ->背後 String.equals()
    System.out.println(names);

    // class(name+score)
    // John 83

    Student s1 = new Student("John", 83);
    ArrayList<Student> students = new ArrayList<>();
    students.add(s1);
    students.add(new Student("Steve", 25));
    students.add(new Student("Mary", 100));

    s1.setScore(90);
    System.out.println(students.get(0).getScore());
  }
}
