package Lab13;

public class Person {
    private String name;
    private String surname;
    private String secondName;

    public Person (String name, String surname, String secondName) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
    }

    public String formatName() {
        String fName = Character.toString((this.name + " ").charAt(0));
        String fSurname = this.surname;
        String fSecondName = Character.toString((this.secondName + " ").charAt(0));
        if (this.name.isEmpty()) fName = "{Имя отсутствует}";
        if (this.surname.isEmpty()) fSurname = "{Фамилия отсутствует}";
        if (this.secondName.isEmpty()) fSecondName = "{Отчество отсутствует}";
        return fSurname + " " + fName + "." + fSecondName + ".";
    }
}
