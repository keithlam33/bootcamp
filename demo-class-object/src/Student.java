public class Student {
  private Candy[] candies;

  public Student() {
    this.candies = new Candy[0];
  }
  // oop private 左的野 要做public 
  // 
  public void receive(Candy newcandy) {
      Candy[] newCandy = new Candy[this.candies.length+1];
      for(int i =0; i < this.candies.length;i++){
        newCandy[i] = this.candies[i];
      }
      newCandy[newCandy.length-1] = newcandy;
      this.candies = newCandy;
  }
  public void showCandies () {

  }

}
