package Lab9_Lab10;

public class SortingStudentsBySurname implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
