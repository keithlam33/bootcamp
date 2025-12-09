public class DemoStringBuilder {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();// ""empty string
    sb.append("hello");
    System.out.println(sb);// hello, changed itself
    sb.append("!!!");
    System.out.println(sb); // hello!!!, changed itself
    
    String s= "hello";
    String s2= s.concat("!!!");
    System.out.println(s2);// hello!!!, new object
    System.out.println(s);// hello , s still hello

    
    //compare string nad stringbuilder
    long before = System.currentTimeMillis();
    String x = "";
      for( int i  = 0; i< 100000;i++ ) {
          x+="a";
      }
      long end = System.currentTimeMillis();
    System.out.println(x.length());
    System.out.println(end-before); // 679ms
      
    before = System.currentTimeMillis();
      StringBuilder sb2 = new StringBuilder();
      for (int i =0; i<100000; i++) {
          sb2.append("a");
      }
      System.out.println(sb2.length());
      end = System.currentTimeMillis();
      System.out.println(end-before);// 3ms
      // if 100,000 times, it shows differences
      // use stringbuilder can faster
      // if just concat the string 1 time / 10 times, no big differences

      //other methods
      System.out.println(sb2.length());
      System.out.println(sb2.charAt(0));
      System.out.println(sb2.isEmpty());
      System.out.println(sb2.indexOf("a"));
      System.out.println(sb2.substring(0, 3));
      // System.out.println(sb2);
      
      // reverse
      String input = "hello";
      StringBuilder sb4= new StringBuilder(input);
      sb4.reverse(); // 修改自己 不用"sb4=sb4.reverse()" 
      // but string 不能修改自己，需要sb4 = sb4.reverse()
      // reverse string
      System.out.println(sb4);// olleh


      //deletecharAt 
      StringBuilder sb3 = new StringBuilder(input);
      sb3.deleteCharAt(3); // removed 4th
      System.out.println(sb3);


  }
}
