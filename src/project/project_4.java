package project;
import java.util.Scanner;
public class project_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 Library Vinay= new Library(10);

		        while (true) {
		            System.out.println("Menu:");
		            System.out.println("1. Add Book");
		            System.out.println("2. Remove Book");
		            System.out.println("3. Display Books");
		            System.out.println("4. Exit");
		            System.out.print("Enter your choice: ");
		            int choice = scanner.nextInt();
		            scanner.nextLine(); // Consume the newline character

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter the book title: ");
		                    String title = scanner.nextLine();
		                    System.out.print("Enter the author name: ");
		                    String author = scanner.nextLine();
		                    System.out.print("Enter the ISBN: ");
		                    String ISBN = scanner.nextLine();
		                    Book book = new Book(title, author, ISBN);
		                    Vinay.addBook(book);
		                    System.out.println("Book added.");
		                    break;
		                case 2:
		                    System.out.print("Enter the ISBN of the book to remove: ");
		                    ISBN = scanner.nextLine();
		                    Vinay.removeBook(ISBN);
		                    System.out.println("Book removed.");
		                    break;
		                case 3:
		                	Vinay.displayBooks();
		                    break;
		                case 4:
		                    System.exit(0);
		                default:
		                    System.out.println("Invalid choice.");
		            }
		        }
		    }

		    static class Book {
		        private String title;
		        private String author;
		        private String ISBN;

		        public Book(String title, String author, String ISBN) {
		            this.title = title;
		            this.author = author;
		            this.ISBN = ISBN;
		        }

		        public String getTitle() {
		            return title;
		        }

		        public void setTitle(String title) {
		            this.title = title;
		        }

		        public String getAuthor() {
		            return author;
		        }

		        public void setAuthor(String author) {
		            this.author = author;
		        }

		        public String getISBN() {
		            return ISBN;
		        }

		        public void setISBN(String ISBN) {
		            this.ISBN = ISBN;
		        }
		    }

		    static class Library {
		        private Book[] books;
		        private int numBooks;

		        public Library(int maxBooks) {
		            books = new Book[maxBooks];
		            numBooks = 0;
		        }

		        public void addBook(Book book) {
		            if (numBooks < books.length) {
		                books[numBooks] = book;
		                numBooks++;
		            }
		        }

		        public void removeBook(String ISBN) {
		            for (int i = 0; i < numBooks; i++) {
		                if (books[i].getISBN().equals(ISBN)) {
		                    books[i] = null;
		                    for (int j = i; j < numBooks-1; j++) {
		                        books[j] = books[j+1];
		                    }
		                    numBooks--;
		                    break;
		                }
		            }
		        }

		        public void displayBooks() {
		            for (int i = 0; i < numBooks; i++) {
		                System.out.println("Title: " + books[i].getTitle());
		                System.out.println("Author: " + books[i].getAuthor());
		                System.out.println("ISBN: " + books[i].getISBN());
		                System.out.println();
		            }
		        }
		    }
		


	}
/* Some Example of Book Title , Author name And ISBN number
 * 
"To Kill a Mockingbird" by Harper Lee - ISBN-10: 0446310786

"1984" by George Orwell - ISBN-10: 0451524934

"The Great Gatsby" by F. Scott Fitzgerald - ISBN-10: 0743273567

"The Lord of the Rings" by J.R.R. Tolkien - ISBN-10: 0544003411

"The Catcher in the Rye" by J.D. Salinger - ISBN-10: 0316769177

"Pride and Prejudice" by Jane Austen - ISBN-10: 0486284735

"The Hobbit" by J.R.R. Tolkien - ISBN-10: 054792822X

"The Alchemist" by Paulo Coelho - ISBN-10: 0062315005

"Animal Farm" by George Orwell - ISBN-10: 0451526341

"The Diary of a Young Girl" by Anne Frank - ISBN-10: 0553296981
 * 
 * */

