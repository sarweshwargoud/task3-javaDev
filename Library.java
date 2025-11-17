// Library.java
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    // Add a book
    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added: " + b.getTitle());
    }

    // Add a user
    public void addUser(User u) {
        users.add(u);
        System.out.println("User added: " + u.getName());
    }

    // View books
    public void viewBooks() {
        System.out.println("\n--- Books List ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    // Issue book
    public void issueBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                if (!b.isIssued()) {
                    b.issue();
                    System.out.println("Book issued successfully: " + b.getTitle());
                } else {
                    System.out.println("Book already issued!");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Return book
    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                if (b.isIssued()) {
                    b.returnBook();
                    System.out.println("Book returned: " + b.getTitle());
                } else {
                    System.out.println("Book was not issued!");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
