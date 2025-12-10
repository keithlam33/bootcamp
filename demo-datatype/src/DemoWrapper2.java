public class DemoWrapper2 {
  public static void main(String[] args) {
    // 3 ways to create Integer object
    Integer x=3;
    Integer x2 = new Integer(3);
    Integer x3 = Integer.valueOf(3);

    

   
    //double object
    Double d=3.5;
    Double d2 = new Double(3.5);
    Double d3 = Double.valueOf(3.5);

    // same pattern to create other primitive class

    //String object (non-Wrapper class)
    String s1 = "hello";
    String s2 = new String("hello");
    String s3 = String.valueOf("hello");

    //
    Integer i1 = Integer.valueOf(127);
    Integer i2 = Integer.valueOf(127);
    System.out.println(i1.equals(i2)); // true
    System.out.println(i1 == i2);// still true
  
    Integer i3 = Integer.valueOf(128);
    Integer i4 = Integer.valueOf(128);
    System.out.println(i3.equals(i4)); // true
    System.out.println(i3 == i4);// false
    // In java, internal code
    // valueOf -> between -128to 128 
    // 如i1存有127
    // i2 不會新開一個127， 而是用i1 同一個127地址
    // 到128, 之後每一個都會再開新的地址  
    //new 強行再開一個新的object, address 不同
    // == 指 checking i3 and i4 的地址是否一樣

    Integer i5 = new Integer(127);
    Integer i6 = new Integer(127);
    System.out.println(i5 == i6);// false 
    // new force to create new object

    // String
    // Pool: "abc"/ String.valueOf("abc")
    // Heap: new String()
    String s4= "abc";// store same string value once
    String s5 = "abc";
    System.out.println(s4.equals(s5));// true
    System.out.println(s4 ==s5); // true

    String s6 = new String("abc"); // heap momory
    System.out.println(s4 == s6);// false

    String s7 = String.valueOf("abc"); 
    System.out.println(s4 == s7);// true

    //s4.replace("bc", "xy");// write operation??
    // string method isempty, charat, contains -> read
    // replace 不是真正的write 因為佢會產生新的string而不是自己變
    // print s4 still original bc
    //xy replace bc 到新的string 只是沒儲存到任何address
    // String s10 = ....... 存返入新的address
    String s10 = s4.replace("bc", "xy");
    // 好少特別額外用new string




  }
}
