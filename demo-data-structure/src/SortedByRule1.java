import java.util.Comparator;
import Person.Occupation;


public class SortedByRule1 implements Comparator<Person> {
  // programmer -> policeman -> clerk
  // if occupation the same, sort by age
  
  
  @Override
  public int compare(Person p1, Person p2){
    if( p1.getOccupation() == p2.getOccupation()){
      if(p1.getAge()>p2.getAge()) return -1;
      if(p1.getAge()<p2.getAge()) return 1;
      return 1;
    }
    if(p1.getOccupation()== Person.Occupation.PROGRAMMER)
      return -1;
    if(p2.getOccupation()== Person.Occupation.PROGRAMMER)
      return 1;
    if(p1.getOccupation()== Person.Occupation.POLICEMAN)
      return -1;
    if(p2.getOccupation()== Person.Occupation.POLICEMAN)
      return 1;
    return 1;
    


  }
}
