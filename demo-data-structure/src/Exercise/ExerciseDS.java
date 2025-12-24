package Exercise;

import java.util.ArrayList;
import java.util.HashSet;

public class ExerciseDS {
  public static String searchId(ArrayList<Student> students, int id){
        for(Student s : students) {
            if(s.getId()== id){
                return s.getName();
            }
        }return "Student not found";
    }


  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    ArrayList<Integer> integers = new ArrayList<>();
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    integers.add(10);
    integers.add(20);
    integers.add(30);
    integers.add(40);
    integers.add(50);
    // 1c. Print all the elements in the list.
    System.out.println(integers);
    // 1d. Remove the number 30 from the list.
    integers.remove(Integer.valueOf(30));
    // 1e. Print the size of the list.
    System.out.println(integers.size());

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Orange");
    // 2b. Check if "Grapes" exists in the list.
    System.out.println(fruits.contains("Grapes"));
    // 2c. If it doesn’t exist, add it to the list.
    if(!fruits.contains("Grapes")){
      fruits.add("Grapes");
    }

    // 2d. Update "Mango" to "Peach".
    int index = fruits.indexOf("Mango");
    if(index != -1){
      fruits.set(index, "Peach");
    }
    // 2e. Print the final list.
    System.out.println(fruits);
    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    ArrayList<Integer> nums= new ArrayList<>();
    nums.add(10);
    nums.add(20);
    nums.add(10);
    nums.add(30);
    nums.add(40);
    nums.add(20);
    nums.add(50);
    // 3b. Remove duplicates from the list using a HashSet.
    HashSet<Integer> nums2 = new HashSet<>(nums);
    // 3c. Print the list after removing duplicates.
    System.out.println(nums2);


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    HashSet<String> countries = new HashSet<>();
    countries.add("USA");
    countries.add("India");
    countries.add("China");
    countries.add("Japan");
    // 4b. Add "Canada" to the set.
    countries.add("Canada");
    // 4c. Add "India" again. Print the result.
    countries.add("India");
    // 4d. Print all elements in the set.
    System.out.println(countries);
    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    HashSet<Double> doublenums = new HashSet<>();
    doublenums.add(1.1);
    doublenums.add(2.2);
    doublenums.add(3.3);
    doublenums.add(4.4);
    doublenums.add(5.5);
    // 5b. Check if the set contains the number 3.3
    System.out.println(doublenums.contains(3.3));
    // 5c. Remove the number 2.2 from the set.
    nums.remove(2.2);
    // 5d. Print the size of the set.
    System.out.println(nums.size());
    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    HashSet<Integer> numSet1 = new HashSet<>();
    HashSet<Integer> numSet2 = new HashSet<>();
    // 6b. Set 1: 10, 20, 30, 40
    numSet1.add(10);
    numSet1.add(20);
    numSet1.add(30);
    numSet1.add(40);
    // 6c. Set 2: 30, 40, 50, 60
    numSet2.add(30);
    numSet2.add(40);
    numSet2.add(50);
    numSet2.add(60);
    // 6d. Find the common numbers of the two sets.
    
    // 6e. Print the resulting set.

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    HashSet<String> names = new HashSet<>();
    names.add("Cherry");
    names.add("Steve");
    names.add("Chloe");
    names.add("Jenny");
    names.add("Vicky");
    // 7b. Convert the HashSet to an ArrayList.
    ArrayList<String> names1= new ArrayList<>(names);
    // 7c. Print the converted list.
    System.out.println(names1);
    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    ArrayList<Student> students = new ArrayList<>();
    // Add the following students:
    // ID: 1, Name: Alice
    students.add(new Student("Alice", 1) );
    // ID: 2, Name: Bob
    students.add(new Student("Bob", 2));
    // ID: 3, Name: Charlie
    students.add(new Student("Charlie", 3));
    // 8b. Iterate over the ArrayList and print each student's details.
    for( Student s : students){
      System.out.println("ID: "+ s.getId()+ ", Name: "+ s.getName());
    }
    // 8c. Remove the student Bob.
    students.remove(new Student("Bob", 2));
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    System.out.println(searchId(students, 2));
    // 8e. Create another ArrayList to store student with name starts with 'A'
    ArrayList<Student> astudents= new ArrayList<>();
    for(Student s: students){
      if(s.getName().startsWith("A"))
        astudents.add(s);
    }
    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    HashSet<Student> students2 = new HashSet<>();
    HashSet<Student> students3 = new HashSet<>();
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    students2.add(new Student("Alice", 1));
    students2.add(new Student("Bob", 2));
    students2.add(new Student("Charlie", 3));
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    students3.add(new Student("Bob", 2));
    students3.add(new Student("Charlie", 3));
    students3.add(new Student("David", 4));
    // 9b. Find the common students of the two sets
    
    // 9c. Print the result.

  }

  public static class Student {
    public static int idCount=0;
    private int id;
    private String name;

    public Student(String name, int id){
      this.id=++idCount;
      this.name=name;
    }
    public String getName() {
      return this.name;
    }
    public int getId() {
      return this.id;
    }
    public void setName(String name) {
      this.name=name;
    }
    
    
    // Constructor
    // getter, setter, etc.
  }

}
