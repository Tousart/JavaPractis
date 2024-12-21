package Lab19;

public class Student {
    private String name;
    private String surname;
    private String specialization;
    private int course;
    private String group;
    private double score;

    public Student(String name, String surname,
                   String specialization, int course,
                   String group, double score) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public int getCourse() {
        return this.course;
    }

    public String getGroup() {
        return this.group;
    }

    public double getScore() {
        return this.score;
    }
    @Override
    public String toString() {
        return "{Name: " + this.name + "; " +
                "Surname: " + this.surname + "; " +
                "Specialization: " + this.specialization + "; " +
                "Course: " + this.course + "; " +
                "Group: " + this.group + "; " +
                "GPA: " + this.score + "}";
    }
}
