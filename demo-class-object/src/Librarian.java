public class Librarian {// A
   public static int idCount = 0;

  private int staffId;
  private Library library; // B

  public Librarian() {
    this.staffId = ++Librarian.idCount;
  }
  
  public int getStaffId() {
    return this.staffId;
  }

  public void setLibrary(Library library) {
    this.library = library;// 補返 librarian 不知道屬於哪一個library
  }// 啲野喺邊個身上，邊個就提供方法

  // Instance method -> this (self)
  public Book findBook(int bookId) {
    if (this.library == null)
      return null; // library not found.
    return this.library.searchBook(bookId);
  }

  public static void main(String[] args) {
    Librarian lb1 = new Librarian();
    System.out.println(lb1.getStaffId()); // 1
    
    Librarian lb2 = new Librarian();
    System.out.println(lb2.getStaffId()); // 2

    Library library =  new Library();
    System.out.println(library.getId()); // 1

    lb2.setLibrary(library);
    // library.setLibrarian(lb2);

  
  }
}
