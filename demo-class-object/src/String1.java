public class String1 {
  private char[] chs;

  // constructor :我要怎樣 new 它？ - string/ char

  //read method
  //constructor string
  public String1(String str) {//代表「我可以用 String 來 new 一個 String1」
    if(str == null)
      this.chs = new char(0);
    else 
      this.chs = str.toCharArray();
  }
 //constructor char
  public String1(char[] chs) {
    this.chs= chs;
  } 
  // sysout -> toString()交代toString
  //我要怎樣把它變成真正的 Java String 印出來？
  public String toString(){
    return new String(this.chs);
    //String 可以直接*char[]
  } 
  //「把某個字換成另一個字，給我一個新字串」
  public String1 replace(char from, char to){
    char[] newChs= new char[this.chs.length];
    for(int i=0; i< this.chs.length; i++) {
      if(this.chs[i] != from){
        newChs[i] = this.chs[i];
      }else {
        newChs[i] = to;
      }
    }  return new String1(newChs);
  }
   //是不是空的？
  public boolean isEmpty() {//使用者不用知道你裡面是 char[]，只要知道有 length() 就夠了
    return this.chs.length == 0;
  }
   //它多長
  public int length() {
    return this.chs.length;
  }
   //「第 N 個字是什麼？
  public char charAt(int index) {
    return this.chs[index];
  }
   //「裡面有沒有某個字？」
  public boolean contains(char ch){
    for(char c: this.chs) {
      if(c == ch) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String1 s = new String1("hello");
    char c = s.charAt(0);
    System.out.println(c);

    boolean result = s.contains('e');
    System.out.println(result);

    String1 s2 = new String1("");
    System.out.println(s2.length());
    System.out.println(s2.isEmpty());
    // System.out.println(s2.CharAt(0));
    // java.lang.ArrayIndexOutOfBoundsException


    //String1 s3 = new String1(null);
    //System.out.println(s3.isEmpty());

    String1 s4 = new String1("goodbye");
    String1 s5 = s4.replace('o', 'x');
    System.out.println(s5);// gxxdbye
    System.out.println(s4);// goodbye
  }
}
