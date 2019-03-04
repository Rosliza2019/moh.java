package chap4;

/**
 discuss on *static* keyword
  - apply to variables and method
  - shared
 * @author Pengguna PC 17
 */
public class Book {
    static int bil = 0;
    String title;
    
    public static void cetak() {
        System.out.println("Jumlah Buku = " + Book.bil);
    }
    
    Book() {
        Book.bil = Book.bil + 1;
        System.out.println("Bil Buku = " + Book.bil);
    }
    
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book.cetak();
        
    }
    
}
