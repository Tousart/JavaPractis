package Lab11_1;

import java.util.Date;

public class Employe {
    private String surname;
    private int id;
    private Date date;

    public Employe(int id, String surname, Date date) {
        this.id = id;
        this.surname = surname;
        this.date = date;
    }

    public int getId() {
        return this.id;
    }

    public String getSurname() {
        return this.surname;
    }

    public Date getdate() {
        return this.date;
    }
}
