package Lab9_Lab10;

import java.util.ArrayList;

public class MergeSort {
    public static void mergeSort(ArrayList<Student> students, Comparator<Student> comparator){
        if (students.size() >= 2) {
            ArrayList<Student> left = new ArrayList<>(students.subList(0, students.size() / 2));
            ArrayList<Student> right = new ArrayList<>(students.subList(students.size() / 2, students.size()));
            mergeSort(left, comparator);
            mergeSort(right, comparator);

            merge(students, left, right, comparator);
        }
    }

    public static void merge(ArrayList<Student> students, ArrayList<Student> left,
                      ArrayList<Student> right, Comparator<Student> comparator) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (comparator.compare(right.get(j), left.get(i)) >= 0) {
                students.set(k, left.get(i));
                i++;
            } else {
                students.set(k, right.get(j));
                j++;
            }
            k++;
        }
        while (i < left.size()) {
            students.set(k, left.get(i));
            i++;
            k++;
        }
        while (j < right.size()) {
            students.set(k, right.get(j));
            j++;
            k++;
        }
    }
}