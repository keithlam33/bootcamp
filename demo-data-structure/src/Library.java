import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
  private static int bookIdCount =0;
  // 用booktype -> a list of books
  // bookid -> a book
  private Map<Integer, Book> bookMap1 ;
  private Map<BookType, List<Book>> bookMap2;

  public Library (){
    this.bookMap1 = new HashMap<> ();
    this.bookMap2 = new HashMap<> ();
  }

  public void add( BookType bookType, Book book){//目的是 把物件放進 Map
      //同時要給每本書一個獨立的 ID
      int bookId = ++bookIdCount;
      book.setId(bookId);
      List< Book> bookList= this.bookMap2.getOrDefault(bookType, new ArrayList<>());// get不到就return 空的arraylist
      bookList.add(book); // bug?
      bookMap2.put(bookType, bookList);
      bookMap1.put(bookId,book);
  }

  public boolean search(int bookId){
      return this.bookMap1.get(bookId) != null;
  }
  public List<Book> search(BookType bookType){
    return this.bookMap2.get(bookType);
  }


  public static enum BookType{
    MATH, HISTORY, ENGLISH, ;
  }
  public static class Book{
      private Integer id;// why not int
      private String name;

      public Book(String name){
        this.id = ++bookIdCount;
        this.name =name;
      }

      public String getName(){
        return this.name;
      }
      
      public void setId(Integer id) {
          this.id=id;
      }

      @Override 
      public String toString() {
        return "Book(" + "id=" +this.id +
        ", name="+ this.name +")";
      }

  }
  public static void main(String[] args) {
    Library l1 = new Library();
    l1.add(BookType.HISTORY, new Book("ABC"));
    l1.add(BookType.MATH, new Book("XYZ"));
    l1.add(BookType.HISTORY, new Book("DEF"));

    System.out.println(l1.search(BookType.MATH));
    System.out.println(l1.search(BookType.HISTORY));

    System.out.println(l1.search(1));


  }
}
