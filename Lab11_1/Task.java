package Lab11_1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;

public class Task {
    private ArrayList<Employe> lst;
    private int id = 1;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public Task() {
        this.lst = new ArrayList<>();
    }

    public void giveTask(String surname, int year, int month, int day) {
        Date date = new Date(year - 1900, month, day);
        this.lst.add(new Employe(this.id, surname, date));
        this.id += 1;
    }

    public String makeTask(int id) {
        for (int i = 0; i < this.lst.size(); i++) {
            if (this.lst.get(i).getId() == id) {
                Date dateEnd = new Date();
                return "ID: " + this.lst.get(i).getId() +
                        "; Surname: " + this.lst.get(i).getSurname() +
                        "; Date End: " + sdf.format(dateEnd);
            }
        }
        return "Task is not found";
    }
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.lst.size(); i++) {
            s += "ID: " + this.lst.get(i).getId() +
                    "; Surname: " + this.lst.get(i).getSurname() +
                    "; Date Start: " + sdf.format(this.lst.get(i).getdate()) + "\n";
        }
        return s;
    }
}
