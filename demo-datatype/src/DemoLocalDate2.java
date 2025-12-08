import java.time.LocalDate;

public class DemoLocalDate2 {
  public static void main(String[] args) {
    // 2024 10-01
    // 2023-01-31
    // 2025-06-30
    // array stores the dates, count the number of dates later than 2024

    

    
    LocalDate[] date= new LocalDate[] {LocalDate.of(2024, 10, 1), LocalDate.of(2023,1,31), LocalDate.of(2025, 6, 30)};
    
  
    int count =0;
    for(int i =0; i<date.length; i++) {
      if(date[i].getYear() >=2024 ) { // getyear int value
      count++;
    }
  }System.out.println(count);


  // find the max date 
  LocalDate backup = date[0];
  for( int i =0; i<date.length; i++) {
        if(date[i].isAfter(date[i+1])) {
            backup = date[i];
            
        }
  }System.out.println(backup);

  }
}
