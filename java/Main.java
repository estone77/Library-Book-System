import java.util.Scanner;
import java.io.*;

public class Main {
	Library library;
	Scanner scan; 

	void readBooks() throws FileNotFoundException{
  
    int bookCount = scan.nextInt();
    String str = scan.nextLine();

    //int bookCount = Integer.parseInt(scan.nextLine());

    for(int i = 0; i < bookCount; i++){
      String author = scan.nextLine(); //author
      String str2 = scan.nextLine(); //book_name
      String str3 = scan.nextLine(); //isbn
      int int1 = scan.nextInt(); //year

      Book book = new Book(author, str2, str3, int1);
      this.library.addBook(book);
      //System.out.println("Book Input: ");
      //book.printBookInfo();
      str = scan.nextLine();
    }
		
	}

	void readUsers() throws FileNotFoundException {
		int userCount = scan.nextInt();
    String str = scan.nextLine();

    for(int i = 0; i < userCount; i++){
      String author = scan.nextLine();
      String str2 = scan.nextLine();
      int int1 = scan.nextInt();

      User user = new User(author, str2, int1);
      this.library.addUser(user);
      //System.out.println("User Input: ");
      //user.printUserInfo();
      str = scan.nextLine();
    }
		
  }

  public static void main(String[] args) throws FileNotFoundException {
		Main mainClass = new Main();
    mainClass.scan = new Scanner(new File("input.txt")); 
    mainClass.library = new Library();

    mainClass.readBooks();
		mainClass.readUsers();

		int option = 0;
    int id = 0;
    String isbn;
		Scanner in = new Scanner(System.in);
    System.out.println("Welcome to the Library.");

		while(option!=6){	
      System.out.println("\nChoose one of the following options (number): ");
			System.out.println("1. Display all books\n2. Display all users\n3. User information\n4. Book information\n5. Borrowing Books?\n6. Quit");
			
      option = Integer.parseInt(in.nextLine());
			
      switch(option){
        case 1: 
          mainClass.library.printAllBooks();
          break;
        case 2: 
          mainClass.library.printAllUsers();
          break;
        case 3:
          System.out.println("Provide User ID:");
          id = Integer.parseInt(in.nextLine());
          mainClass.library.getUserInfo(id);
          break;
        case 4:
          System.out.println("Provide Book ISBN:");
          isbn = in.nextLine();
          mainClass.library.getBookInfo(isbn);
          break;
        case 5:
          System.out.println("Provide User ID:");
          id = Integer.parseInt(in.nextLine());
          System.out.println("Provide Book ISBN:");
          isbn = in.nextLine();
          mainClass.library.borrowBook(id, isbn);
          break;
        case 6:
          break;
        default:
          System.out.println("Please choose a different option!");
          System.out.println("\n");
      }
			
		} 
    
	}
}
