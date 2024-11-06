package Lab2_BookShelf;

import java.util.ArrayList;
import java.util.Collections;

public class Bookshelf {
    private ArrayList<Book> books;

    public Bookshelf() {
        this.books = new ArrayList<>();
    }

    public void add_book(String author, String title, int year_of_writing) {
        this.books.add(new Book(author, title, year_of_writing));
    }

    public void remove_book(int number) {
        this.books.remove(number - 1);
    }

    public void sorted_shelf() {
        for (int i = 0; i < (this.books.size() - 1); i++) {
            for (int j = (i + 1); j < this.books.size(); j++) {
                if (this.books.get(i).get_year_of_writing() > this.books.get(j).get_year_of_writing()) {
                    Collections.swap(this.books, i, j);
                }
            }
        }
        //this.books.stream().sorted(Comparator.comparing(BookShelf.Book::get_year_of_writing)).toList();
    }

    public String get_book(int number) {
        return this.books.get(number - 1).toString();
    }

    public void change_author(String author, int number) {
        this.books.get(number - 1).set_author(author);
    }

    public void change_title(String title, int number) {
        this.books.get(number - 1).set_title(title);
    }

    public void change_year_of_writing(int year, int number) {
        this.books.get(number - 1).set_year_of_writing(year);
    }

    public String get_old_book() {
        int min = 10000;
        int number = 0;
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).get_year_of_writing() < min) {
                min = this.books.get(i).get_year_of_writing();
                number = i;
            }
        }
        return this.books.get(number).toString();
    }

    public String get_new_book() {
        int max = -10000;
        int number = 0;
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).get_year_of_writing() > max) {
                max = this.books.get(i).get_year_of_writing();
                number = i;
            }
        }
        return this.books.get(number).toString();
    }
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.books.size(); i++) {
            s = s + (i + 1) + " " + this.books.get(i) + "\n";
        }
        return s;
    }
}
