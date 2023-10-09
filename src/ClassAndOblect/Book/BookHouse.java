package ClassAndOblect.Book;

    public class BookHouse{
        Book[] books = new Book[1000];
        int size = 0;

        public BookHouse(){
        }

        public BookHouse(Book[] book,int size){
            this.books = book;
            this.size = size;
        }

         void addBook(Book book){
            books[size] = book;
            size++;
        }

         void printBooks(){
            for (int i = 0; i < size; i++) {
                System.out.println(books[i].getData());
            }
        }



        void searchBook(String name) {
            boolean boo = false;
            for (int i = 0; i < size; i++) {
                if (name.equals(books[i].bookName)) {
                    boo = true;
                    System.out.println(books[i].getData());
                }
            }

            if (!boo){
                System.out.println("Data Not Found");
            }
        }
    }
