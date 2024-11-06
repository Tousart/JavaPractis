package Lab7_8;

public class Test {
    public static void main(String[] args) {
        Printable[] printableArray = {
                new Book("Первые шаги"),
                new Book("Война и мир"),
                new Printable() {
                    @Override
                    public String getTitle() {
                        return "Не книга";
                    }
                }
        };
        Book.printBooks(printableArray);

        System.out.print("\n");
        for (Printable i : printableArray) {
            System.out.println(i.getTitle());
        }
    }
}