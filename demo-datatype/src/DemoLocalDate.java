import java.time.LocalDate;

public class DemoLocalDate {
  public static void main(String[] args) {
      //java.lang no need import
    LocalDate ld1 = LocalDate.of(2025,12,31);  // if no import, 1. restart 2. no extension

    ld1 = ld1.plusDays(1); // think what plusdays should put? new date or self
    System.out.println(ld1); // 2026-01-01

    LocalDate afterThreeYear =  ld1.plusYears(3L);// plus into new variable
    System.out.println(ld1);
    System.out.println(afterThreeYear);// 2029 -01-01

    System.out.println(ld1.minusWeeks(2L)); //2025-12-18
    // get value
    System.out.println(ld1.getDayOfMonth()); // 1號
    System.out.println(ld1.getMonthValue());// 1月
    System.out.println(ld1.getMonth());// january
    ld1 = ld1.plusDays(200L);
    System.out.println(ld1.getDayOfYear()); // 201 


    // comparison
    LocalDate joinDate= LocalDate.of(2023, 4, 28);
    LocalDate today = LocalDate.of(2023, 8, 1);
    LocalDate probationEndDate = joinDate.plusMonths(3L);
    if(today.isAfter(probationEndDate)) {//true false // isAfter/ isBefore
      // isAfter() -> ">" , not >=
      // isBefore() -> "<", not <=
      // cant ==
        System.out.println("Passed Probation.");
    }else {
      System.out.println("still not yet pass probation");
    }

    //effective dat 2026 01 01
    LocalDate effectiveDate = LocalDate.of(2026, 1, 1);
     today = LocalDate.of(2026, 1, 1);
    if(today.equals(effectiveDate) || today.isAfter(effectiveDate)) {// >=
      // cant write " == ", equals 除左primitive 不用. 其他都用
      // primitive else , dont use == >= <=
      System.out.println("It is taking effective today.");
    }else {
      System.out.println("It does not take effective.");
    }

    System.out.println(ld1.isLeapYear()); // true false
    System.out.println(ld1.withYear(2024));// modify 2024
    System.out.println(ld1);
    System.out.println(ld1.compareTo(LocalDate.of(2026, 7, 13))); // 7 days distance
    int dateDiff = ld1.compareTo(effectiveDate); // 6 months
    System.out.println(dateDiff);
    // compareTo if same year compare month, if same month compare days

    if(ld1.compareTo(effectiveDate)>0) {
        System.out.println(ld1 + "is later than" + effectiveDate);
    }

    // Date d1= new Date(); used 30 years ago


    // wrong demo
    LocalDate ld2 = LocalDate.of(2024, 10, 31);
    LocalDate ld3 = LocalDate.of(2024, 10, 31);
    System.out.println(ld2 == ld3);// false 
    // NEVER use == >= <= at comparing non primitive value
    // should use isAfter(), isBefore(), equals()












  }
}
