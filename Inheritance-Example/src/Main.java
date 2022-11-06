import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Library lib = new Library("Maltepe University Library");
        Prof prof1 = new Prof("Ensar", "Gül", 62, "Professor");
        Student student1 = new Student("Furkan", "Pınar", 20, 200706007);

        int selection;
        char ans;

        //***** Library and Books
        System.out.println("*****// "+ lib.getLibraryName() + " //*****");
        lib.showBooks();
        do {
            selection = lib.selectBook(prof1);
            if (selection == 0 || selection == 1 || selection == 2){
                Book book = lib.getBook(selection);
                lib.delBook(selection);
                //***** Prof read
                System.out.print("> " + prof1.getDegree() + " " + prof1.getName());
                prof1.read(book);
                System.out.println();

                //***** Student listening
                System.out.print("> Student " + student1.getName() + " ");
                student1.listen();
                System.out.print(" " + prof1.getDegree());

                System.out.println("\nWill the professor continue to use the book? (y or n)>>");
                ans = sc.next().charAt(0);
                if(ans == 'n'){
                    lib.addBook(book);//the book was returned
                    lib.reCreateList();
                    System.out.println("Will the professor choose another book? (y or n)>>");
                    ans = sc.next().charAt(0);
                    if (ans == 'n') break;
                    else if (ans == 'y') continue;
                    else{
                        System.out.println("Wrong entry, program terminated!");
                        break;
                    }
                }
                else if (ans == 'y'){
                    System.out.println("> " + prof1.getDegree() + " " + prof1.getName() + " still using the book.");
                    break;
                }
                else{
                    System.out.println("Wrong entry, program terminated!");
                    break;
                }
            }
        }
        while (true);

    }
}