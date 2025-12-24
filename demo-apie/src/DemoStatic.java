public class DemoStatic {
  
  // static variable 公家
  // static final variable (cannot be modified)
  // instance variable = object variable
  // final variable( compile 要assign value)少用

  private static final int SECOND_IN_MINUTE = 60; // 指係常數不變的 一分鐘有 60秒
  private static int idCounter =0;
  private final String name = "John";
  private final String name1;
  public DemoStatic() {
    //logic 再出名 if else for
    //只要最後有assign 名 
    this.name1 = "Peter";
  }
// constuctor 建構緊object

// input parameter 能produce output-> static method
// if inputparameter cannot produce output -> instance method
public static int sum(int x, int y){//static method
  return x+y; // static method 沒有this, 公家冇人可以occuply
}

  public String getName() {
    return this.name;
  }
  public static void main(String[] args) {
    DemoStatic d1 = new DemoStatic();
    System.out.println(d1.getName());


  }
}
