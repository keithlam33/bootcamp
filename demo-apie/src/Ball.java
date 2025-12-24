public class Ball {
  private Color color;


  private Ball(Color color){
    this.color = color;
  }
  public Color getColor(){
    return this.color;
  }
  // 
  public static Ball ofRed() {
    return new Ball(Color.RED);
  }
}
