import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DemoLocalDateTime {
  public static void main(String[] args) {
    
    LocalDateTime currentTime = LocalDateTime.of(2025, 12, 31,23,59,59);
    System.out.println(currentTime); // 2025-12-31T23:59:59 iso format


    System.out.println(currentTime.plusMinutes(32).plusSeconds(40));
    System.out.println(currentTime.minusDays(2));


    //Re-format
    System.out.println(currentTime.format(DateTimeFormatter.ofPattern("dd MMM HH:mm")));
    System.out.println(currentTime.format(DateTimeFormatter.ofPattern("dd MMM hh:mma")));
    // 31 Dec 23:59
    // 31 Dec 11:59 pm
    // DD - 365 (dayofYear) dd- 31 

    //TimeZone
  
    ZoneId newYork = ZoneId.of("America/New_York");
    ZonedDateTime newYorkTime = ZonedDateTime.of(currentTime, newYork );
    System.out.println(newYorkTime);

   // newYorkTime (ZonedDateTime) -> LocalDateTime
    ZoneId hongKong = ZoneId.of("Asia/Hong_Kong");

    //LocalDateTime hongKongLocalDateTime = newYorkZonedTime
    //.withZoneSameInstant(hongKong).toLocalDateTime();
    // System.out.println(hongKongLocalDateTime); // 2026-01-01T12:59:59


    System.out.println(LocalDateTime.now());// current time
    System.out.println(LocalDate.now());// 2025-12-08

    // epoch second -> 1970 to now time in second, over flow in 2037 
    System.out.println(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
    System.out.println(LocalDateTime.now().toEpochSecond(ZoneOffset.ofHours(8)));// ofhour +8 utc +8
    System.out.println(LocalDateTime.now().getNano());
    System.out.println(LocalDateTime.now().truncatedTo(ChronoUnit.MICROS));


  }
}
