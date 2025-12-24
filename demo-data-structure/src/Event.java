import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Event {
  
  private String name;
  private Importance importance;
  private LocalDateTime eventDate; 

  public Event(String name, Importance importance){
    this.name = name;
    this.importance = importance;
  }
  public Event( Importance importance, LocalDateTime eventDate){
    this.importance = importance;
    this.eventDate= eventDate;
  }
  public Event( Importance importance){
    
    this.importance = importance;
  }
  
  public Importance getImportance() {
    return this.importance;
  }
  public LocalDateTime getEventDate() {
    return this.eventDate;
  }
  public static class SortByImportance2 implements Comparator<Event>{
      @Override
      public int compare(Event e1, Event e2) {
        if(e1.getImportance()== e2.getImportance()){
          if(e1.getEventDate().isBefore(e2.getEventDate())){// <
              return -1;
          }else{
            return 1;
          }
        }else{
          if(e1.getImportance()== Importance.HIGH) return -1;
          if(e2.getImportance() == Importance.HIGH) return 1;
          if(e1.getImportance()== Importance.MEDIUM) return -1;
          if(e2.getImportance() == Importance.MEDIUM) return 1;
          return 1;
        }
      }
  }
  @Override
  public String toString() {
    return "Event(" + "importance="+this.importance+
        ", eventDate= "+this.eventDate +")";
  }

  public static enum Importance{
    HIGH,MEDIUM,LOW,;
  }
  public static class SortByImportance implements Comparator<Event>{
      @Override
      public int compare(Event e1, Event e2) {
        if(e1.getImportance()== Importance.HIGH) return -1;
        if(e2.getImportance() == Importance.HIGH) return 1;
        if(e1.getImportance()== Importance.MEDIUM) return -1;
        if(e2.getImportance() == Importance.MEDIUM) return 1;
        return 1;
      }
  }
  

  public static void main(String[] args) {
    // comparator: high medium low
    PriorityQueue<Event> eventQueue = new PriorityQueue<>(new SortByImportance());// priorityqueue: 不斷做sort
    eventQueue.add(new Event(Importance.LOW));
    eventQueue.add(new Event(Importance.HIGH));
    eventQueue.add(new Event(Importance.MEDIUM));
    eventQueue.add(new Event(Importance.HIGH));
    eventQueue.add(new Event(Importance.MEDIUM));
    eventQueue.add(new Event(Importance.HIGH));

    System.out.println(eventQueue.poll().getImportance());
    System.out.println(eventQueue.poll().getImportance());
    System.out.println(eventQueue.poll().getImportance());
    System.out.println(eventQueue.poll().getImportance());
    System.out.println(eventQueue.poll().getImportance());
    System.out.println(eventQueue.poll().getImportance());

    ArrayList<Event> events = new ArrayList<>();
    events.add(new Event("Peter", Importance.LOW));
    events.add(new Event("John",Importance.HIGH));
    events.add(new Event("Law",Importance.MEDIUM));
    events.add(new Event("Alex",Importance.HIGH));
    events.add(new Event("Pro",Importance.MEDIUM));
    events.add(new Event("Dav",Importance.HIGH));
    Collections.sort(events, new SortByImportance());
    System.out.println(events);


    PriorityQueue<Event> eventQueue2 = new PriorityQueue<>(new SortByImportance2());
    eventQueue2.add(new Event(Importance.LOW, LocalDateTime.of(2025, Month.DECEMBER, 31,23,59,59)));
    eventQueue2.add(new Event(Importance.MEDIUM, LocalDateTime.of(2025, Month.DECEMBER, 31,23,59,59)));
    eventQueue2.add(new Event(Importance.HIGH, LocalDateTime.of(2025, Month.DECEMBER, 31,23,59,59)));
    eventQueue2.add(new Event(Importance.LOW, LocalDateTime.of(2025, Month.MARCH, 31,23,59,59)));

    System.out.println(eventQueue2.poll());
    System.out.println(eventQueue2.poll());
    System.out.println(eventQueue2.poll());
    System.out.println(eventQueue2.poll());
    
  }
}
