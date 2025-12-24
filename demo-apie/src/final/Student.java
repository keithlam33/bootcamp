public class Student {
  public final Subject[] subjects = new Subject[] 
  {new Subject("CHIN"),
    new Subject("ENG"), new Subject("MATH")
  };
// final array length 
// means that every student only have three subject
// subject content can change
// by default taking chin, eng, math
  
//如無限多subject , use add/ drop
  public void changeFirstSubject( Subject subject) {
    this.subjects[0] = subject;
  }
  public void changeSecondSubject( Subject subject) {
    this.subjects[1] = subject;
  }
  public void changeThirdSubject( Subject subject) {
    this.subjects[2] = subject;
  }
  public String showSubjects (){
    return this.subjects[0].getName() +","
    + this.subjects[1].getName() +"," +
    this.subjects[2].getName();
  }

  public double averageScore() {
    return (this.subjects[0].getScore()+
    this.subjects[1].getScore()+ 
    this.subjects[2].getScore())/ 3.0;
  }
public void setScore(int idx, int score) {
    this.subjects[idx].setScore(score);
}
  


  public static void main(String[] args) {
    Student s = new Student();
    s.changeFirstSubject( new Subject("HISTORY"));
    System.out.println(s.showSubjects());
    System.out.println(s.averageScore());

  }


}
