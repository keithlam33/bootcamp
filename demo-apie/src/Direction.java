


public enum Direction { 
  EAST('E', -1), SOUTH('S', -2), WEST('W',1), NORTH('N', 2),;
  //static variables carry static values
  private char value; // E,S,W,N
  private int number;// attribute can be used for presentation relationship
  private Direction(char value, int number) {
    // jvm call constructor 4 times= 4 box 
    this.value = value;
    this.number = number;
  }
  //presentation method
  // public boolean isOpposite(Direction direction) {
  //     return (this == Direction.WEST && direction == Direction.EAST) 
  //           || (this == Direction.EAST && direction == Direction.WEST)
  //           ||(this == Direction.NORTH && direction == Direction.SOUTH)
  //           ||(this == Direction.SOUTH && direction == Direction.NORTH);
  // }
  public boolean isOpposite(Direction direction) {
      return this.number* -1 == direction.getNumber();
  }
  public Direction opposite() {
      for(Direction d : Direction.values()) { // values() static method
          if(this.number*-1 == d.getNumber()){
            return d;
          }
      }
      return null;
  }
  public int getNumber() {
    return this.number;
  }
  public char getValue() {
    return this.value;
  }
  
  // jvm-> class loader -> create enum -> main()
  // 搵個object 裝住 ，有4個box 裝住, 不是String
  //背後有constructor
  // private Direction() {
  // } private 比jvm 去用 
  public static void main(String[] args) {
    System.out.println(Direction.NORTH);// sysout 背後call toString
    // "NORTH"
    System.out.println(Direction.NORTH.getValue());// N

    System.out.println(Direction.NORTH == Direction.NORTH);// true
    // == address 係咪一樣 
    System.out.println(Direction.EAST.isOpposite(Direction.WEST));//true
    System.out.println(Direction.EAST.isOpposite(Direction.NORTH));// false
    System.out.println(Direction.EAST.opposite());
  
  
  }
}
