package Lab9_Lab10;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSort {
    public static void quickSort(ArrayList<Student> students, int start, int end, Comparator<Student> comparator) {
        if (start < end) {
//            int pivot = students.get(end).getScore();
//            int i = (start - 1);
//            for (int j = start; j < end; j++) {
//                if (students.get(j).getScore() < pivot) {
//                    i++;
//                    Collections.swap(students, i, j);
//                }
//            }
            Student pivot = students.get(end);
            int i = (start - 1);
            for (int j = start; j < end; j++) {
                if (comparator.compare(students.get(j), pivot) > 0) {
                    i++;
                    Collections.swap(students, i, j);
                }
            }
            Collections.swap(students, i + 1, end);

            quickSort(students, start, i, comparator);
            quickSort(students, i + 2, end, comparator);
        }
    }
}
