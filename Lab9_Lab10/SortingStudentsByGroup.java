package Lab9_Lab10;

public class SortingStudentsByGroup implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGroup().compareTo(o2.getGroup());
    }
}
