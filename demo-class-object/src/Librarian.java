public class Librarian {// A
  private Library library;// B
  private int staffId;

  public static int idCount=0;

  public Librarian(){
    this.staffId = ++idCount;
  }
  public int getStaffId() {
    return this.staffId ;
  }
  public void setLibrary( Library library) {
    this.library = library;
  }
  // 啲野喺邊個身上，邊個就提供方法


  public Book findBook (int bookId){
    if(this.library == null) 
      return null;// library not found
    return this.library.searchBook(bookId);
  }
  public static void main(String[] args) {
    Librarian lb1 = new Librarian();
    System.out.println(lb1.getStaffId());
    Librarian lb2 = new Librarian();
    System.out.println(lb2.getStaffId());
    Library library = new Library();
    System.out.println(library.getId());

    lb2.setLibrary(library);
    

  }
}
