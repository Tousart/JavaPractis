package Lab9_Lab10;

import java.util.ArrayList;

public class StudentsArray {
    private ArrayList<Student> lst;

    public StudentsArray () {
        this.lst = new ArrayList<>();
    }

    public void addStudent(String name, String surname,
                           String specialization, int course,
                           String group, double score) {
        this.lst.add(new Student(name, surname, specialization, course, group, score));
    }

    public ArrayList<Student> outArray() {
        return this.lst;
    }
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.lst.size(); i++) {
            s += "\n{" + "Name: " + this.lst.get(i).getName() + "; " +
                    "Surname: " + this.lst.get(i).getSurname() + "; " +
                    "Specialization: " + this.lst.get(i).getSpecialization() + "; " +
                    "Course: " + this.lst.get(i).getCourse() + "; " +
                    "Group: " + this.lst.get(i).getGroup() + "; " +
                    "GPA: " + this.lst.get(i).getScore() + "}";
        }
        return s;
    }
}
