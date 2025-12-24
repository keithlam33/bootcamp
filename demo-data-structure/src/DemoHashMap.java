import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  // data structure: 存放方式 使你更快速找到
  // get -> dont need loop to find , quicker
  // hashMap vs arraylist: arraylist, linkedlist 更自然，hashmap 人為
  
  public static void main(String[] args) {
    // Arraylist, linkedlist, hashset裝一籃子same type object
    
    // key -> value
    // Key（鍵）：用來查找的索引
    // Value（值）：對應的資料（例如 Student 物件）
    //student id -> student

    ArrayList<Student> students= new ArrayList<>();
    students.add(new Student("John",30));
    students.add(new Student("Sally",80));
    students.add(new Student("Leo",90));
    // 左key: Student name 右value: Student
    Map<String, Student> studentMap= new HashMap<>();
    for(Student student: students){
      studentMap.put(student.getName(), student);// add entry
      // put(key, value) 把這對資料放進 Map 裡
    }
    // hashmap 特性 for searching , you just use get() to find target object
    // hashmap.get() -> use key to find value
    System.out.println(studentMap.get("Sally").getScore());
    // a map has many entries
    for(Map.Entry<String, Student> entry:studentMap.entrySet()){
        System.out.println(entry.getKey()+ ", " + entry.getValue());// 
    }

    // hashmap use get() to find target object, while arraylist use loop to find 
    Student leo = studentMap.get("Leo");// risky, because it may not exist
    if(leo !=null){ // remove risk, not knowing leo exist or not
      System.out.println("Leo exists..."+ leo.getName()+ "/"+ leo.getScore());
    }else{
      System.out.println("Leo doesn't exists");
    }


  }
}
