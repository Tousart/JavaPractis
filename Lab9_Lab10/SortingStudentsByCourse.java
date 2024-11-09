package Lab9_Lab10;

public class SortingStudentsByCourse implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getCourse(), o2.getCourse());
    }
}
