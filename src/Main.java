import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String barOfConor;
        final int NUM = 0;
        String word = "Planer";
        barOfConor = NUM + word;
        System.out.println(barOfConor + NUM + word);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, "+ name);
    }
}