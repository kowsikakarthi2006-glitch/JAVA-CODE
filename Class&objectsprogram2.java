class Library {
    int serialNo;
    String bookname;
    String author;
    int year;
    String category;

    Library(int serialNo, String bookname, String author, int year, String category) {
        this.serialNo = serialNo;
        this.bookname = bookname;
        this.author = author;
        this.year = year;
        this.category = category;
    }

    void display() {
        System.out.println("Serial No : " + serialNo);
        System.out.println("Book Name : " + bookname);
        System.out.println("Author    : " + author);
        System.out.println("Year      : " + year);
        System.out.println("Category  : " + category);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Library[] books = new Library[3];

        Library b1 = new Library(103, "Power System", "Srinivasan", 2005, "EEE");
        books[0] = b1;

        Library b2 = new Library(104, "Microprocessor", "Nanthini", 2012, "ECE");
        books[1] = b2;

        Library b3 = new Library(105, "Robotics", "Malathi", 2009, "Mechanical");
        books[2] = b3;

        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}
