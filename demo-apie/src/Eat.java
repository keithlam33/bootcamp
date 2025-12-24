// Interface
// 1. no attribute
// 2. method are abstract 寫不寫都是abstract (implicitly)
// 3. no constructor
// 4. static method, variable

public interface Eat { // 100% abstract 抽象 
  public static String str= "Hello";
  void eat(); // (abstract )void eat();
  public static int sum (int x, int y){
    return x+y;
  }
  public static void main (String[] args){
    System.out.println(Eat.str);
    System.out.println(Eat.sum(10,3));
  }

}
