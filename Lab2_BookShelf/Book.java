package Lab2_BookShelf;

public class Book {
    private String author;
    private String title;
    private int year_of_writing;

    public Book(String author, String title, int year_of_writing) {
        this.author = author;
        this.title = title;
        this.year_of_writing = year_of_writing;
    }

    public String get_author() {
        return this.author;
    }

    public void set_author(String author) {
        this.author = author;
    }

    public String get_title() {
        return this.title;
    }

    public void set_title(String title) {
        this.title = title;
    }

    public int get_year_of_writing() {
        return this.year_of_writing;
    }

    public void set_year_of_writing(int year_of_writing) {
        this.year_of_writing = year_of_writing;
    }
    @Override
    public String toString() {
        return "BookShelf.Book{" + "Автор: " + this.author +
                "; Название: " + this.title +
                "; Дата написания: " + this.year_of_writing + "}";
    }
}