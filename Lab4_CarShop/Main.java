package Lab4_CarShop;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Basket basket = new Basket();

        System.out.print("Введите логин: ");
        String login = str.nextLine();
        while (!login.equals("loba")) {
            System.out.println("Такого пользователя не существует!");
            System.out.print("Введите логин: ");
            login = str.nextLine();
        }

        System.out.print("Введите пароль: ");
        String password = str.nextLine();
        while (!password.equals("666")) {
            System.out.println("Неправильный пароль!");
            System.out.print("Введите пароль: ");
            password = str.nextLine();
        }

        String q = "";
        while (!q.equals("q")) {
            System.out.print("\nКаталог автомобилей:" + "\n" +
                    "1. BMW" + "\n" +
                    "2. MERCEDES" + "\n" +
                    "3. AUDI" + "\n" +
                    "Выберите каталог (для выхода нажмите q / для корзины - b): ");
            q = str.nextLine();
            String mark = "";
            if (q.equals("b")) {
                System.out.println(basket.toString());
                while (!mark.equals("q")) {
                    System.out.print("Купить все all / Купить предмет по номеру buy / Удалить del / Выйти q: ");
                    mark = str.nextLine();
                    if (mark.equals("all")) {
                        basket.buyAll();
                        System.out.println(basket.toString());
                    }
                    else if (mark.equals("buy") || mark.equals("del")) {
                        System.out.print("Введите номер товара: ");
                        mark = str.nextLine();
                        basket.removeCar(Integer.parseInt(mark));
                        System.out.println(basket.toString());
                    }
                }
            }
            else if (q.equals("BMW") || q.equals("1")) {
                Catalog k = new Catalog("BMW");
                System.out.println("\n" + k.toString());
                while (!mark.equals("q")) {
                    System.out.print("Добавьте модель в корзину (для выхода нажмите q): ");
                    mark = str.nextLine();
                    if (!k.checkBMW(mark).equals("")) {
                        basket.addCar(k.checkBMW(mark));
                    }
                }
            }
            else if (q.equals("MERCEDES") || q.equals("2")) {
                Catalog k = new Catalog("MERCEDES");
                System.out.println("\n" + k.toString());
                while (!mark.equals("q")) {
                    System.out.print("Добавьте модель в корзину (для выхода нажмите q): ");
                    mark = str.nextLine();
                    if (!k.checkMERCEDES(mark).equals("")) {
                        basket.addCar(k.checkMERCEDES(mark));
                    }
                }
            }
            else if (q.equals("AUDI") || q.equals("3")) {
                Catalog k = new Catalog("AUDI");
                System.out.println("\n" + k.toString());
                while (!mark.equals("q")) {
                    System.out.print("Добавьте модель в корзину (для выхода нажмите q): ");
                    mark = str.nextLine();
                    if (!k.checkAUDI(mark).equals("")) {
                        basket.addCar(k.checkAUDI(mark));
                    }
                }
            }
        }
    }
}