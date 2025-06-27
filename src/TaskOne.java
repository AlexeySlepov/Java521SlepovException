import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isNumber = false;
        int number = 0;

        while (!isNumber) {
            System.out.println("Введите целое число:");

            try {
                number = scanner.nextInt();
                isNumber = true;
            } catch (InputMismatchException e) {
                System.err.println("Ошибка: введено не число! Попробуйте снова.");
                scanner.next();
            }
        }

        System.out.println("Вы ввели: " + number);
        scanner.close();
    }
}
