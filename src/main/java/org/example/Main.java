package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Atomic Habits", "James Clear", 9781847941831L, 2022);
        Books book2 = new Books("The Mountain is You", "Brianna Wiest", 9781949759228L, 2024);
        Patrons patron1 = new Patrons(770849L, "sivasubramaniyan", 7708495689L, "sivaraja202000@gmail.com");
        Patrons patron2 = new Patrons(9445956L, "DivyaKolupii", 9445987594L, "divyaps2900@gamil.com");
        LibraryInventory libraryInventory = new LibraryInventory();
        libraryInventory.addBooks(book1);
        libraryInventory.addBooks(book2);
        PatronManagement patronManagement = new PatronManagement();
        patronManagement.addNewPatron(patron1);
        patronManagement.addNewPatron(patron2);
        patron1.borrowbooks(book1);
        patron2.borrowbooks(book2);
        patron1.getBorrowedBooks();
        patron2.getBorrowedBooks();
        System.out.println(patron1);
        System.out.println(patron2);
        System.out.println(patron1);
        System.out.println(patron2);
        LendingProcess lendingProcess = new LendingProcess(libraryInventory, patronManagement);
        lendingProcess.bookCheckout(book1, patron1);
        lendingProcess.bookCheckout(book2, patron2);


    }
}