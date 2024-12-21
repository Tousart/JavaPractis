package Lab18; import java.util.Scanner; public class Test1 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("ОШИБКА: Деление на ноль");
        } catch (NumberFormatException e) {
            System.out.println("ОШИБКА: Введенное значение должно быть Integer");
        }
        finally {
          System.out.println("Конец программы");
        }

    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}