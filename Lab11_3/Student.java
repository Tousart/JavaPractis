package Lab11_3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {
    private String name;
    private int course;
    private Calendar date = Calendar.getInstance();

    public Student (String name, int course, int day, int month, int year) {
        this.name = name;
        this.course = course;
        this.date.set(Calendar.YEAR, year);
        this.date.set(Calendar.MONTH, month - 1);
        this.date.set(Calendar.DAY_OF_MONTH, day);
    }

    public String toString(String format) {
        String s = "Такого формата даты нет(";
        if (format.toLowerCase().equals("полный")) {
            DateFormat df = new SimpleDateFormat("dd MMMM yyyy");
            s = "Имя: " + this.name +
                    "; Курс: " + this.course +
                    "; Дата рождения: " + df.format(this.date.getTime());
        } else if (format.toLowerCase().equals("средний")) {
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
            s = "Имя: " + this.name +
                    "; Курс: " + this.course +
                    "; Дата рождения: " + df.format(this.date.getTime());
        } else if (format.toLowerCase().equals("короткий")) {
            DateFormat df = new SimpleDateFormat("dd.MM.yy");
            s = "Имя: " + this.name +
                    "; Курс: " + this.course +
                    "; Дата рождения: " + df.format(this.date.getTime());
        }
        return s;
    }
}