public class Book {
    private int id;
    public static int idCount=0;

    public Book () {
      this.id = ++idCount;
    }
    public int getId() {
      return this.id;
    }


}
