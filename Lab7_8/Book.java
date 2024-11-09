package Lab7_8;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public static void printBooks(Printable[] printable) {
        for (Printable i: printable) {
            if (i instanceof Book) System.out.println(i.getTitle());
        }
    }
}