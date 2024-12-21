package Lab19;

class NSException extends Exception {
    NSException (String errorMessage) {
        super(errorMessage);
    }
}

public class Task2 {
    public static void checkNS(String name, String surname, StudentsArray students) throws MyException{
        boolean flag = false;

        for (int i = 0; i < students.outArray().size(); i++) {
            if (students.outArray().get(i).getName().equals(name) &&
                    students.outArray().get(i).getSurname().equals(surname)) {
                flag = true;
            }
        }

        if (!flag) {
            throw new MyException(name + " " + surname + " - cтудента с таким именем не существует!");
        } else System.out.println(name + " " + surname + " - такой студик есть)");
    }

    public static void main(String[] args) throws MyException {
        StudentsArray students = new StudentsArray();
        students.addStudent("Ваня", "Петров", "Smackmin", 1, "КВБО-04-23", 4);
        students.addStudent("Дима", "Малков", "Chma", 3, "УЭБО-01-21", 3);
        System.out.println(students.toString());

        checkNS("Ваня", "Петров", students);
        checkNS("Гоша", "Петров", students);
    }
}
