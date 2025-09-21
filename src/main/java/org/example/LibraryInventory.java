package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import java.util.ArrayList;
import java.util.List;

public class LibraryInventory {
    List<Books> booksList = new ArrayList();
    private static final Logger logger = LoggerFactory.getLogger(LendingProcess.class);


    public List<Books> getBooksList() {
        return this.booksList;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }

    public LibraryInventory() {
        this.booksList = new ArrayList();
    }

    public LibraryInventory(List<Books> booksList) {
        this.booksList = booksList;
    }

    public void addBooks(Books books) {
        this.booksList.add(books);
        System.out.println("Book" + books + " is added sucessfully in the inventory ");
    }

    public void removeBooks(Books books) {
        this.booksList.remove(books);
        logger.info("Book {} is successfully removed from the inventory", books);

    }

    public void updattitle(Books books, String title) {
        books.setTitle(title);
        logger.info("Book {} title is successfully updated", books);

    }

    public void updateauthor(Books books, String author) {
        books.setAuthor(author);
        logger.info("Book {} Author is successfully updated", books);
    }

    public void updateISBN(Books books, long ISBN) {
        books.setISBN(ISBN);
        logger.info("Book {} ISBN is successfully updated", books);
    }

    public void updatepublicationYear(Books books, int publicationYear) {
        books.setPublicationYear(publicationYear);
        logger.info("Book {} PublicationYear is successfully updated", books);
    }

    public List<Books> searchBooksByTitle(String title) {
        List<Books> result = new ArrayList();

        for(Books book : this.booksList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }

        logger.info("Total number of books in the inventory with title '{}' is {}", title, result.size());

        return result;
    }

    public List<Books> searchBooksByAuthor(String authorname) {
        List<Books> result = new ArrayList();

        for(Books book : this.booksList) {
            if (book.getAuthor().equalsIgnoreCase(authorname)) {
                result.add(book);
            }
        }

        System.out.println("total  number of books in the inventory by the Author name " + authorname + "is " + result);
        return result;
    }

    public Books SearchBookByISBN(long ISBN) throws BookNotFoundException {
        for(Books book : this.booksList) {
            if (book.getISBN() == ISBN) {
                return book;
            }
        }

        throw new BookNotFoundException("Books with the ISBN" + ISBN + " not found");
    }
}
