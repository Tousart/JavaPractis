package Lab2_BookShelf;

import java.util.Scanner;
import java.lang.*;

public class TestBookShelf {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);
        Bookshelf k = new Bookshelf();
        // 1
        System.out.println("Операция добавления книги на полку:");
        k.add_book("Джек Лондон", "Мартин Иден", 1909);
        k.add_book("Михаил Булгаков", "Мастер и Маргарита", 1940);
        k.add_book("Виктор Гюго", "Отверженные", 1845);
        k.add_book("Артур Хейли", "Аэропорт", 1968);
        System.out.println(k.toString());
        // 2
        System.out.println("Операция удаления (четвертой) книги с полки:");
        k.remove_book(4);
        System.out.println(k.toString());
        // 3
        System.out.println("Операция сортировки книг на полке по году написания:");
        k.sorted_shelf();
        System.out.println(k.toString());
        // 4
        System.out.println("Операция выдачи книги по номеру (первому) на полке:");
        System.out.println(k.get_book(1));
        // 5
        System.out.println("\nперация по замене автора книги по ее номеру на полке:");
        k.change_author("Николай Гоголь", 1);
        System.out.println(k.get_book(1));
        System.out.println("\nОперация по замене названия книги по ее номеру на полке:");
        k.change_title("Мертвые души", 1);
        System.out.println(k.get_book(1));
        System.out.println("\nОперация по замене года написания книги по ее номеру на полке:");
        k.change_year_of_writing(1835, 1);
        System.out.println(k.get_book(1));
        // 6
        System.out.println("\nОперация по выдаче самой старой книги (по году написания):");
        System.out.println(k.get_old_book());
        // 7
        System.out.println("\nОперация по выдаче самой новой книги (по году написания):");
        System.out.println(k.get_new_book());
    }
}