public class User {

  private String fname;
  private String lname;
  private int id;
  private boolean has_book = false; 
  private String book_isbn;
  

  public User(String f, String l, int i) {
    fname = f;
    lname = l;
    id = i;
  }

  // getter functions
  String get_fname() {
    return fname;
  }

  String get_lname() {
    return lname;
  }

  int get_id() {
    return id;
  }

  // setter functions
  void set_fname(String f) {
    fname = f;
  }

  void set_lname(String l) {
    lname = l;
  }

  void set_id(int i) {
    id = i;
  }

  void borrowed_book(String s) {
    book_isbn = s;
    has_book = true;
  }

  void return_book() {
    book_isbn = "";
    has_book = false;
  }

  public void printUserInfo() {
    String status;
    if(has_book == true) {
      status = "Borrowed - " + book_isbn;
    }
    else {
      status = "Eligible to borrow";
    }
    System.out.println("First Name: " + get_fname());
    System.out.println("Last Name: " + get_lname());
    System.out.println("User ID: " + get_id());
    System.out.println("Status: " + status);
    System.out.println();
  }
}
