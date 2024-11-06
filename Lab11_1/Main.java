package Lab11_1;

public class Main {
    public static void main(String[] args) {
//        Date date = new Date(124, 1, 12, 10, 0, 0);
//        SimpleDateFormat sdf = new SimpleDateFormat("Дата получения задания: d.M.y | Время: HH:mm:ss");
//        System.out.println(sdf.format(date.getTime()));

        Task k = new Task();
        k.giveTask("Vega", 2024, 9, 10);
        k.giveTask("Beerpong", 2024, 10, 5);
        System.out.println(k.toString());
        System.out.println(k.makeTask(2));
    }
}
