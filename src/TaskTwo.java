import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date = null;
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Введите дату в формате 'год-месяц-день' (например, 2022-01-31):");
            String input = scanner.nextLine();

            try {
                date = LocalDate.parse(input);
                isValid = true;
            } catch (DateTimeParseException e) {
                System.err.println("Ошибка: неверный формат даты! Повторите.");
            }
        }

        System.out.println("Дата: " + date);
        scanner.close();
    }
}
