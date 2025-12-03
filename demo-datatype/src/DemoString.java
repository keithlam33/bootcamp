public class DemoString {
  public static void main(String[] args) {
    // hello -> string value
    // s -> string variable
    String s ="hello";

    // String s1 = 'hello'; - not java
    // String s2 = 'h'; cannot assign char value into string variable

    String s2 = "Keith Lam";

    // can + operator
    s2 = s2 + "!!!"; // right to left
    System.out.println(s2);

    // String not string, it's a class, not primitive
    //1. length
    int len = s.length();
    System.out.println(len);// s hello length = 5
    s = "goodbye";// change s value
    System.out.println(s.length());// 7

    // 2. charAt(), index starts with 0(0 means the 1st position)
    char firstChar = s.charAt(0);
    System.out.println(firstChar);// g
    
    // last char
    // index: start with 0 -> length -1= last char 
    char lastChar = s.charAt(s.length()-1);
    System.out.println(lastChar);
    // s.charAt(-1);// error, has to be positive
    // s.charAt(s.length())// error, forgot to -1

    // 3. equals()
    boolean isGoodbye = s.equals("goodbye");
    System.out.println(isGoodbye);// true
    boolean isGoodbye1 = s.equals("hello");
    System.out.println(isGoodbye1);// false
    System.out.println(s.equals("goodbye"));// directly sysout
    System.out.println(s.equals("Goodbye"));// capital false
    System.out.println(s.equalsIgnoreCase("Goodbye"));// true

    // 4. contains, for loop(slow)
    System.out.println(s.contains("oo"));// true
    System.out.println(s.contains("o"));// true, one word
    System.out.println(s.contains("oo "));// false; with space
    System.out.println(s.contains("dye"));//false, wrong order
    System.out.println(s.contains("Good"));// false, capital letter

    // 5. isEmpty
    // Empty String is a String value("")
    String emptyString = "";
    System.out.println(s.isEmpty());// false, goodbye not empty

    String spaceString = " ";
    System.out.println(spaceString.isEmpty());// false, space = not empty, but is a Blank
    // 6. isBlank()
    System.out.println(s.isBlank());// false
    System.out.println(emptyString.isBlank());// true, no space 
    System.out.println(spaceString.isBlank());// true, space is a Blank but not empty

    // 7. replace, for loop(slow)
    String newString = s.replace("oo", "xx");
    System.out.println(newString);// gxxbye, but only changed in this section 
    System.out.println(s);// goodbye, s didn't change because of replace in previous

    System.out.println(s.replace('g', 'h'));// hoodbye, replace char g

    // 8. startsWith()
    System.out.println(s.startsWith("go"));// true
    System.out.println(s.startsWith("db"));// false

    // 9. endsWith()
    System.out.println(s.endsWith("ye"));// true
    System.out.println(s.endsWith("od"));// false

    // 10. indexOf()
    System.out.println(s.indexOf('d')); // 3, start from 0
    System.out.println(s.indexOf('o')); // 1, first o
    System.out.println(s.indexOf('0')); // -1
    System.out.println(s.indexOf("bye"));// 4 
    System.out.println(s.indexOf("ooooo"));// -1, not exist 
    System.out.println(s.lastIndexOf('o'));// 2 , last o
    System.out.println(s.lastIndexOf('b'));//4
     //s = "ooooyooo";
    // System.out.println(s.lastIndexOf('o'));//7
     //System.out.println(s.length());//8
     //System.out.println(s.contains('y'));


     // 11. concat() -> +operation
     System.out.println(s.concat("!!!"));// goodbye!!!

     // 12. substring()
     System.out.println(s.substring(3));// index 3, dbye
     System.out.println(s.substring(2, 5)); // index2= 3rd char, 5 -> 5th char
     // result: odb 3rd-5th

     // 13. toLowerCase(), toUpperCase()
     System.out.println(s.toUpperCase());// GOODBYE
     System.out.println("bootCAMP".toLowerCase());// bootcamp
     
     // 14. trim() remove spaces at head and tail
     System.out.println(" Java Python.  ".trim());// "Java Python."
     // chain method
     System.out.println(" Java Python.  ".trim().length());// 12
     // trim return string, thus can continue use length
     // length return int, thus end


  }
}
