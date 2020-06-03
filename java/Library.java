public class Library
{
  private Book[] bookArray; // bookArray = new Book[100];
  int bookCount = 0;
  private User[] userArray; // userArray = new User[100];
  int userCount = 0;

  public Library() {
    bookArray = new Book[100];
    userArray = new User[100];
  }

  public void addBook(Book book) {
    bookArray[bookCount] = book;
    bookCount += 1;
  }

  public void addUser(User user){
    userArray[userCount] = user;
    userCount += 1;
  }

  public void getUserInfo(int id) {
    boolean userFound = false;
    User user;

    for(int i = 0; i < userCount; i++) {
      user = userArray[i];
      if(id == user.get_id()) {
        user.printUserInfo();
        userFound = true;
        break;
      }
    }

    if(userFound == false) {
      System.out.println("User Not Found");
    }
  }

  public void getBookInfo(String isbn) {
    boolean bookFound = false;
    Book book;

    for(int i = 0; i < bookCount; i++) {
      book = bookArray[i];
      if(isbn.equals(book.get_ISBN())) {
        book.printBookInfo();
        bookFound = true;
        break;
      }
    }

    if(bookFound == false) {
      System.out.println("Book Not Found");
    }
  }

  public void borrowBook(int id, String isbn) {
    boolean userFound = false;
    User user = null;

    for(int i = 0; i < userCount; i++) {
      user = userArray[i];
      if(id == user.get_id()) {
        userFound = true;
        break;
      }
    }

    if(userFound == false) {
      System.out.println("User Not Found");
      return;
    }

    boolean bookFound = false;
    Book book = null;

    for(int i = 0; i < bookCount; i++) {
      book = bookArray[i];
      if(isbn.equals(book.get_ISBN())) {
        book.printBookInfo();
        bookFound = true;
        break;
      }
    }

    if(bookFound == false) {
      System.out.println("Book Not Found");
      return;
    }

    if(book.is_available() == false) {
      System.out.println("Book is not Available");
    }
    user.borrowed_book(isbn);
    book.borrow_book();
    System.out.println("Book successfully borrowed");
  }

  public void printAllBooks() {
    for(int i = 0; i < bookCount; i++){
      bookArray[i].printBookInfo();
    }
  }

  public void printAllUsers() {
    for(int i = 0; i < userCount; i++){
      userArray[i].printUserInfo();
    }
  }
}
