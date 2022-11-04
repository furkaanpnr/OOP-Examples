import java.util.Scanner;

public class Library{
    private String libraryName;
    Scanner sc = new Scanner(System.in);

    public Library(String libraryName){
        this.libraryName = libraryName;
    }

    // Shows the books
    public void showBooks(Book[] books){
        System.out.println("Books:" + "\n" +
                "1- " + books[0].getBookName() + " (Pages:" + books[0].getPageNum() + ")" + "\n" +
                "2- " + books[1].getBookName() + " (Pages:" + books[1].getPageNum() + ")" + "\n" +
                "3- " + books[2].getBookName() + " (Pages:" + books[2].getPageNum() + ")" + "\n" +
                "4- " +"New books comming soon....\n");
    }
    // Book selecting menu
    public int selectBook(Prof prof,Book[] books){
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

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
}
