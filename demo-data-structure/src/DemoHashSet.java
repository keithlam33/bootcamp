import java.util.ArrayList;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    //java collection: list/ set/ queue
    // list 有序order set冇序order  
    // set (avoid duplicated)
    // hashset 慢好多 但要remove duplicate 都會用 
    // A HashSet is backed by a HashMap
    HashSet<String>names = new HashSet<>();
    names.add("Tommy");//true
    names.add("Tommy");//false
    names.add("Jenny");//true
    System.out.println(names.size());//2
    System.out.println(names);// Jenny, Tommy

    ArrayList<Integer> ages = new ArrayList<>();
    ages.add(15);
    ages.add(30);
    ages.add(40);
    ages.add(15);
    System.out.println(ages);

    HashSet<Integer> ageSet = new HashSet<>();// 抄入去
    for(Integer age: ages) { //從ages 抄過去
      ageSet.add(age);
    }System.out.println(ageSet);
    // HashSet<Integer> ageSet = new HashSet<>();// 抄入去
    // for(Integer age: ages) { //從ages 抄過去
    //   if(!ageSet.add(age)){If the age was already inside → returns false
    //System.out.println("Duplicated element: "+ age);}
    // }System.out.println(ageSet);
    HashSet<Integer> ages3 = new HashSet<>(ages);// constructor
    System.out.println(ages3);// 直接remove duplicate


    // When you call add(element), the set checks:
    // hashCode() → to find the bucket where the element should go.
    // equals() → to check if an element already exists in that bucket.
    // HashSet relies on hashCode() + equals() to detect duplicates.
    HashSet<Student> students = new HashSet<>();
    students.add(new Student("John", 80));
    students.add(new Student("Jenny", 70));
    students.add(new Student("John", 80));
    System.out.println(students.size());

    System.out.println(students.contains(new Student("Jenny", 70)));
    // contains(object) new Student to check if equals object
    System.out.println(students.isEmpty());
    students.remove(new Student("John", 80));// hashset no index
    System.out.println(students.toString());

    HashSet<Integer> hs = new HashSet<>();
    hs.add(14);
    hs.add(23);
    hs.add(49);
    hs.add(100);
    hs.add(200);
    System.out.println(hs);
    for(Integer num: hs){
      System.out.println(num);
    }
    ArrayList<Integer> hs1 = new ArrayList<>(hs);
    System.out.println(hs1);
    hs1.sort(null);
    System.out.println(hs1);




  }
}
