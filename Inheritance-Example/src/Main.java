public class Main {
    public static void main(String[]args){
        Book b1 = new Book("Java Programming Book",200);
        Book b2 = new Book("C Programming Book", 300);
        Book b3 = new Book("OOP Book", 500);
        Book[] books = {b1,b2,b3}; // Array of book objects
        Library lib = new Library("Maltepe University Library");
        Prof prof1 = new Prof("Ensar", "Gül", 62, "Professor");
        Student student1 = new Student("Furkan", "Pınar", 20, 200706007);

        int selection;

        //***** Library and Books
        System.out.println("*****// "+ lib.getLibraryName() + " //*****");
        lib.showBooks(books);
        while (true){
            selection = lib.selectBook(prof1,books);
            if (selection == 0 || selection == 1 || selection == 2) break;
        }

        //***** Prof read
        System.out.print("> " + prof1.getDegree() + " " + prof1.getName());
        prof1.read(books,selection);
        System.out.println();

        //**** Student listening
        System.out.print("> Student " + student1.getName() + " ");
        student1.listen();
        System.out.print(" " + prof1.getDegree());

    }
}