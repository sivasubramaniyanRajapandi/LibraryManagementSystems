package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LendingProcess {
    private LibraryInventory libraryInventory;
    private PatronManagement patronManagement;

    private static final Logger logger = LoggerFactory.getLogger(LendingProcess.class);

    public LendingProcess(LibraryInventory libraryInventory, PatronManagement patronManagement) {
        this.libraryInventory = libraryInventory;
        this.patronManagement = patronManagement;
    }




    public LibraryInventory getLibraryInventory() {
        return this.libraryInventory;
    }

    public void setLibraryInventory(LibraryInventory libraryInventory) {
        this.libraryInventory = libraryInventory;
    }

    public PatronManagement getPatronManagement() {
        return this.patronManagement;
    }

    public void setPatronManagement(PatronManagement patronManagement) {
        this.patronManagement = patronManagement;
    }

    public boolean bookCheckout(Books book, Patrons patrons) {
        if (book.isAvailable()) {
            patrons.borrowbooks(book);
            logger.info("The book is available for checkout and patron {} lent it", patrons.getMember_id());
            book.setAvailable(false);
            return true;
        } else {
            logger.warn("The book {} is not available for checking out", book.getTitle());
            return false;
        }
    }

    public boolean bookreturn(Books book, Patrons patron) {
        if (book != null) {
            patron.returnBook(book);
            book.setAvailable(true);
            logger.info("The book {} has been returned successfully by patron {}", book.getTitle(), patron.getMember_id());
            return true;
        } else {
            return false;
        }
    }
}
