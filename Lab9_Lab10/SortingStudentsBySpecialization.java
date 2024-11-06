package Lab9_Lab10;

public class SortingStudentsBySpecialization implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSpecialization().compareTo(o2.getSpecialization());
    }
}
