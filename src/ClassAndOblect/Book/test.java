package ClassAndOblect.Book;

public class test {
    public static void main(String[] args) {
        Book book1 = new Book(3,"abay","syrym");
        Book book2 = new Book(5,"ne ssy","hz kto");
        Book book3 = new Book(6,"avangers","Sten li");

        BookHouse bookHouse = new BookHouse();
        bookHouse.addBook(book1);
        bookHouse.addBook(book2);
        bookHouse.addBook(book3);
//        bookHouse.printBooks();
        bookHouse.searchBook("avangers");
    }
}
