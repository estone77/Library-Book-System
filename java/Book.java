public class Book {

  // data members 
  private String title;
  private String author;
  private String ISBN;
  private int year;
  private boolean available = true;

  public Book(String t, String a, String i, int y) {
    title = t;
    author = a;
    ISBN = i;
    year = y;
  }

  // getter functions
  String get_title() {
    return title;
  }

  public String get_author() {
    return author;
  }

  String get_ISBN() {
    return ISBN;
  }

  public int get_year() {
    return year;
  } 

  // setter functions 
  public void set_title(String t) {
      title = t;
  }

  public void set_author(String a) {
    author = a;
  }

  public void set_isbn(String i) {
    ISBN = i;
  }

  public void set_year(int y) {
    year = y;
  }
  
  public void borrow_book() {
    available = false;
  }

  public void return_book() {
    available = true;
  }

  public boolean is_available() {
    return available;
  }

  public void printBookInfo() {
    String status;
    if(available == true) {
      status = "In library";
    }
    else {
      status = "Not available";
    }

		System.out.println("Title: " + get_title());
		System.out.println("Author: " + get_author());
		System.out.println("ISBN: " + get_ISBN());
		System.out.println("Year: " + get_year());
    System.out.println("Available: " + status);
		System.out.println();
	}
}
