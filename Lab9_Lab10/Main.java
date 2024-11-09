package Lab9_Lab10;

public class Main {
    public static void main(String[] args) {
        SortingStudentsByNAME name = new SortingStudentsByNAME();
        SortingStudentsBySurname surname = new SortingStudentsBySurname();
        SortingStudentsBySpecialization spec = new SortingStudentsBySpecialization();
        SortingStudentsByCourse course = new SortingStudentsByCourse();
        SortingStudentsByGroup group = new SortingStudentsByGroup();
        SortingStudentsByGPA gpa = new SortingStudentsByGPA();

        System.out.println("Массив студентов:");
        StudentsArray k = new StudentsArray();
        k.addStudent("Ivan", "Jaga", "Web", 1, "IKBO", 5);
        k.addStudent("Vitya", "AK47", "Web", 3, "IKBO",2.1);
        k.addStudent("Lena", "Golova", "Devops", 228, "UEBU",4);
        k.addStudent("Sasha", "Gray", "Deb", 2, "LALA",1.7);
        k.addStudent("Petya", "Mandah", "Devops", 1, "UEBU",3);
        k.addStudent("Maria", "Shlu", "Min", 4, "BANK",4.8);
        System.out.println(k.toString());

        System.out.println("\nМассив студентов, отсортированный по среднему баллу (по убыванию):");
        QuickSort.quickSort(k.outArray(), 0, k.outArray().size() - 1, gpa);
        System.out.println(k.toString());
        System.out.println("\nМассив студентов, отсортированный по среднему баллу (по возрастанию):");
        MergeSort.mergeSort(k.outArray(), gpa);
        System.out.println(k.toString());

        System.out.println("\nМассив студентов, отсортированный по имени (по убыванию):");
        QuickSort.quickSort(k.outArray(), 0, k.outArray().size() - 1, name);
        System.out.println(k.toString());
        System.out.println("\nМассив студентов, отсортированный по имени (по возрастанию):");
        MergeSort.mergeSort(k.outArray(), name);
        System.out.println(k.toString());

        System.out.println("\nМассив студентов, отсортированный по фамилии (по убыванию):");
        QuickSort.quickSort(k.outArray(), 0, k.outArray().size() - 1, surname);
        System.out.println(k.toString());
        System.out.println("\nМассив студентов, отсортированный по фамилии (по возрастанию):");
        MergeSort.mergeSort(k.outArray(), surname);
        System.out.println(k.toString());

        System.out.println("\nМассив студентов, отсортированный по специальности (по убыванию):");
        QuickSort.quickSort(k.outArray(), 0, k.outArray().size() - 1, spec);
        System.out.println(k.toString());
        System.out.println("\nМассив студентов, отсортированный по специальности (по возрастанию):");
        MergeSort.mergeSort(k.outArray(), spec);
        System.out.println(k.toString());

        System.out.println("\nМассив студентов, отсортированный по курсу (по убыванию):");
        QuickSort.quickSort(k.outArray(), 0, k.outArray().size() - 1, course);
        System.out.println(k.toString());
        System.out.println("\nМассив студентов, отсортированный по курсу (по возрастанию):");
        MergeSort.mergeSort(k.outArray(), course);
        System.out.println(k.toString());

        System.out.println("\nМассив студентов, отсортированный по группе (по убыванию):");
        QuickSort.quickSort(k.outArray(), 0, k.outArray().size() - 1, group);
        System.out.println(k.toString());
        System.out.println("\nМассив студентов, отсортированный по группе (по возрастанию):");
        MergeSort.mergeSort(k.outArray(), group);
        System.out.println(k.toString());
    }
}