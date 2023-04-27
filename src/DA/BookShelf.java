package DA;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class BookShelf {

    public static class Book {
        private String title;
        private String author;
        private int pages;
        private int year;

        public Book(String title, String author, int pages, int year) {
            this.title = title;
            this.author = author;
            this.pages = pages;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", pages=" + pages +
                    ", year=" + year +
                    '}';
        }
    }

    private Stack<Book> bookStack;

    public BookShelf() {
        this.bookStack = new Stack<>();
    }

    public void addBook(Book book) {
        bookStack.add(book);
    }

    public Book removeBook() {
        if (bookStack.isEmpty()) {
            throw new UnsupportedOperationException("Book shelf is empty; no book to remove");
        }
        return bookStack.pop();
    }

    public List<Book> searchByTitle(String searchTitle) {
        List<Book> result = new ArrayList<>();
        for (Book book: bookStack) {
            if (book.title.equals(searchTitle)) {
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> searchByAuthor(String searchAuthor) {
        List<Book> result = new ArrayList<>();
        for (Book book: bookStack) {
            if (book.author.equals(searchAuthor)) {
                result.add(book);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Resurrection", "Marc Swain", 388, 1818);
        Book book2 = new Book("Hamlet", "William Shakespeare", 555, 1765);
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(book1);
        bookShelf.addBook(book2);
        System.out.println(bookShelf.searchByAuthor("William Shakespeare"));
        bookShelf.removeBook();
        System.out.println(bookShelf.searchByAuthor("William Shakespeare"));
        System.out.println(bookShelf.searchByTitle("Resurrection"));
    }
}
