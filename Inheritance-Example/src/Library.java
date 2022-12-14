import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library{
    private String libraryName;
    Scanner sc = new Scanner(System.in);
    private Book b1 = new Book("Java Programming Book",200);
    private Book b2 = new Book("C Programming Book", 300);
    private Book b3 = new Book("OOP Book", 500);
    private List<Book> bookList = new ArrayList<Book>();
    private List<Book> defaultList = new ArrayList<Book>();
    public Library(String libraryName){
        this.libraryName = libraryName;
        bookList.add(this.b1);
        bookList.add(this.b2);
        bookList.add(this.b3);
        defaultList.add(this.b1);
        defaultList.add(this.b2);
        defaultList.add(this.b3);
    }
    // Shows the books
    public void showBooks(){
        int i = 1;
        System.out.println("Books:");
        for(Book book: bookList){
            System.out.println(i+"- " + book.getBookName() + " (Pages:" + book.getPageNum() + ")\n");
            i++;
        }
        System.out.println("4- New books comming soon...");
    }
    // Book selecting menu
    public int selectBook(Prof prof){
        int index = 0;
        System.out.println(prof.getDegree() + " " + prof.getName() +" selecting book>>");
        index = sc.nextInt();
        switch (index){
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                System.out.println("As we said new books comming soon!");
            default:
                System.out.println("Please chose a book");
                break;
        }
        return -1;
    }
    public void reCreateList(){
        bookList = new ArrayList<>(defaultList);
    }
    public void addBook(Book book){
        bookList.add(book);
    }
    public void delBook(int index){
        bookList.remove(index);
    }
    public Book getBook(int index){
       return bookList.get(index);
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
}
