public class Library {
  // librarian
  // book
  // each library has one librarian
  // library -> id
  // book -> id
  public static int idCount =0;
  private int id;
  private Book[] books;

  // two design: private Librarian librarian; or
  //在 librarian class: private Library library
  // either one different 角度 
  public Library () {
    this.id= ++Library.idCount;
    this.books = new Book[0];
  }
  public int getId () {
    return this.id;
  }
  public Book searchBook(int bookId) {
    for(Book book: this.books) {
      if(book.getId() == bookId)
        return book;
    }
    return null;// bookid not found
  }
  public Book[] getBook() {
    return this.books;
  }
  //public void setLibrarian (Librarian librarian) {
    //librarian.setLibrary(this);
  //}

public void add( Book newBook) {
  Book[] newBooks = new Book[this.books.length+1];
  for(int i =0; i < this.books.length; i++){
      newBooks[i] = this.books[i];
  }newBooks[newBooks.length-1] = newBook;
  this.books = newBooks;
}
  // main librarian find book by library id and book id


}
