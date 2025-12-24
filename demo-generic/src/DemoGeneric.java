import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {
  
  public static void main(String[] args) {
    // arraylist 要先學generic  arraylist of < 任何class>

    ArrayList<String> strings= new ArrayList<>();

    // before java 5
      // List emails = new ArrayList(); similar object List<Object> objects= new ArrayList<>()
      //  compile time issue, 冇type, call 不到入面的method 
      // emails.add("leo@gmail.com");
      // emails.add("leo@gmail.com");
      // System.out.println(emails.size());
      // emails.add(10);
      // emails.add(true);
      // emails.get(0).charAt(0); call 不到 charAt 

      // for(Object o : emails){
      //   if(o instanceof String){ object 係咪 ＝string
      //     String s = (String) o; polymorthism assign object as string type
      //     System.out.println(s.charAt(0));
      //   }else {if (o instanceof Boolean){}} else{}
      // }逐個check
      // 而家早啲定下 type in compile time
      List<String> passwords = new ArrayList<>();
      passwords.add("abc1234");
      for(String p : passwords){
        System.out.println(p.charAt(0));
      }


      

  }
}
