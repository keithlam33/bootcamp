public class Teacher {
  private Candy[] candies;

  // a teacher has 22 candies
  //5 students
  // main: distrubute all candies to all students
  // finally , teacher has no candies
  // show all candies for each student
public void add(Candy candy) {
Candy[] newCandy = new Candy[this.candies.length +1];
for(int i=0; i<this.candies.length; i++){
  newCandy[i] = this.candies[i];
}newCandy[newCandy.length-1]= candy;
this.candies = newCandy;
}
  public Teacher () {
    this.candies = new Candy[0];
  }
  public void add (Candy[] candies){
    for( Candy c : candies) {
      this.add(c);
    }
  }
  public  void distribute(Student student){
    Candy candy = this.deductCandy();
    if( candy != null) {
        student.receive(candy);// 交換入student 地址
    }
  }
  // teacher object dont even know how student store the candies
  public void distributeAll(Student[] students) {
    int idx = 0;
    while(true) {
          Candy candy = this.deductCandy();
      if(candy == null) {
        break;
        idx = idx% students.length ==0? 0:idx;
        students[idx++].receive(candy);
      }
    }
  }

  public Candy deductCandy() {
    if(this.candies.length <=0)
      return null;
    Candy deductedCandy = this.candies[this.candies.length-1];
    Candy[] newCandies = new Candy[this.candies.length-1];
    for(int i=0; i<candies.length -1; i++){
      newCandies[i] = this.candies[i];
    }
    this.candies = newCandies;
    return deductedCandy;
  }
public static void main(String[] args) {
  Candy[] candies = new Candy[] {
    Candy.ofRed(),Candy.ofRed(),Candy.ofRed(),
    Candy.ofRed(),Candy.ofRed(),Candy.ofRed(),
    Candy.ofBlue(),Candy.ofBlue(),Candy.ofBlue(),
    Candy.ofBlue(),Candy.ofBlue(),Candy.ofBlue(),
    Candy.ofYellow(),Candy.ofYellow(),Candy.ofYellow(),
    Candy.ofYellow(),Candy.ofYellow(),Candy.ofYellow(),
    Candy.ofYellow(),Candy.ofRed(),Candy.ofBlue(),
    Candy.ofYellow()
  };
  System.out.println(candies.length);


}
}
