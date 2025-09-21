package org.example;

import java.util.ArrayList;
import java.util.List;

public class Patrons {
    private long member_id;
    private String name;
    private long mobileNumber;
    private String emailId;
    private List<Books> borrowedBooks;

    public Patrons(long member_id, String name, long mobileNumber, String emailId) {
        this.member_id = member_id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.borrowedBooks = new ArrayList();
    }

    public List<Books> getBorrowedBooks() {
        return this.borrowedBooks;
    }

    public void setBorrowedBooks(List<Books> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public long getMember_id() {
        return this.member_id;
    }

    public void setMember_id(long member_id) {
        this.member_id = member_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void borrowbooks(Books book) {
        this.borrowedBooks.add(book);
        book.setAvailable(false);
    }

    public void returnBook(Books book) {
        if (this.borrowedBooks.contains(book)) {
            this.borrowedBooks.remove(book);
            book.setAvailable(true);
        }

    }

    public String toString() {
        long var10000 = this.member_id;
        return "Patron{member_id=" + var10000 + ", name='" + this.name + "', emailId='" + this.emailId + "', borrowedBooks=" + this.borrowedBooks.size() + "}";
    }
}
