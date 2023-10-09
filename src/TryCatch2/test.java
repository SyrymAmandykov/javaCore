package TryCatch2;

public class test {
    public static void main(String[] args) {
        Book book1 = new Book(1,"facebook","Mark");
        Book book2 = new Book(0,null,null);
        Book book3 = new Book(1,"instagram","Mark");
        Book book4 = new Book(1,"VK","durov");
        Book book5 = new Book(1,"Amazon","Bezos");
        Book book6 = new Book(1,"Telegram","Pavel");
        Book book7 = null;
        Book book8 = null;

        Library library1 = new Library();


        library1.addBook(book1);
        library1.addBook(book7);
        library1.addBook(book8);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library1.addBook(book5);
        library1.addBook(book6);


        library1.printBooks();




    }
}
