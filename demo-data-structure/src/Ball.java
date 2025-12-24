import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Ball>{
    private Color color;

    public Ball(Color color){
      this.color = color;
    }


    public Color getColor() {
      return this.color;
    }

  public enum Color{
    RED, YELLOW, BLUE,;
  }
  // instance method, this ball vs that ball
  @Override
  public int compareTo(Ball that){
      // return this (-1)
      // return that (1)
      if(this.color == color.RED)return -1;
      if(that.getColor() == color.RED)return 1;
      if(this.color == color.BLUE)return -1;
      if(that.getColor() == color.BLUE)return 1;
      if(this.color == color.YELLOW)return -1;
      if(that.getColor() == color.YELLOW)return 1;
      return 1;

  }
  @Override
  public String toString() {
      return "Ball(" +"color=" + this.color+")";
  }
  public static void main(String[] args) {
    // Arrays.sort()
    int[] arr = new int[] {3,-9,10,0};
    Arrays.sort(arr);// pass by reference, primitive(usually for numbers)
    System.out.println(Arrays.toString(arr));


    // Collections.sort()
    //Hashset -> add() -> Object.equals()
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Color.BLUE));
    balls.add(new Ball(Color.YELLOW));
    balls.add(new Ball(Color.BLUE));
    balls.add(new Ball(Color.BLUE));
    balls.add(new Ball(Color.RED));
    balls.add(new Ball(Color.YELLOW));
    Collections.sort(balls); // compareTo ->責任 
    System.out.println(balls);
  }
}
