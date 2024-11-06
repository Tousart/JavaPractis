package Lab3;


public class Test {
    public static void main(String[] args) {
        Report k = new Report();
        k.addEmployee("Бубнов Всеволод Сергеевич", "Поэт", 930000.87);
        k.addEmployee("Гаврилин Дато Гурамович", "Чилл", 930000.8657);
        k.addEmployee("Деневич Антон Станиславович", "Трудяга", 15);
        System.out.println(k.toString());
        k.removeEmployee("Деневич Антон Станиславович");
        System.out.println(k.toString());
        k.addEmployee("Васильев Иван Борисович", "Чисто сидит", 666);
        System.out.println(k.toString());
    }
}