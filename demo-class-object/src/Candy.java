public class Candy {
  private String color;// "red", "yellow", "blue"
  

  // ! Private constructor
  private Candy (String color) {
    this.color = color;
  }

public static Candy ofRed() {
  // 因為得三隻顏色 鎖住佢不能 new candy("red") -> private constructor
  return new Candy("RED");
} 
public static Candy ofBlue() {// 因為得三隻顏色
  return new Candy("BLUE");
} 
public static Candy ofYellow() {// 因為得三隻顏色
  return new Candy("YELLOW");
} 
public String getColor() {
  return this.color;
}

}
