import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Здрасте! Это калькулятор v2.\nВведите первое целое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();
        System.out.print("Выберите арифметическое действие (1-4) с введёнными числами\n(1. Сложение, 2. Вычитание, 3. Умножение, 4. Деление): ");
        int arithmetic = scanner.nextInt();
        scanner.close();

        // c if
        System.out.println("\n***** if *****");
        if (arithmetic == 1)
            System.out.printf("Сумма %d и %d равна %d", num1, num2, (num1 + num2));
        else if (arithmetic == 2)
            System.out.printf("Разность %d и %d равна %d", num1, num2, (num1 - num2));
        else if (arithmetic == 3)
            System.out.printf("Произведение %d и %d равно %d", num1, num2, (num1 * num2));
        else if (arithmetic == 4)
            System.out.printf("Частное %d и %d равно %.2f", num1, num2, ((double)num1 / num2));
        else
            System.out.print("Такое действие отсутствует.");

        // c case
        System.out.println("\n\n***** case *****");
        switch (arithmetic){
            case 1:
                System.out.printf("Сумма %d и %d равна %d", num1, num2, (num1 + num2));
                break;
            case 2:
                System.out.printf("Разность %d и %d равна %d", num1, num2, (num1 - num2));
                break;
            case 3:
                System.out.printf("Произведение %d и %d равно %d", num1, num2, (num1 * num2));
                break;
            case 4:
                System.out.printf("Частное %d и %d равно %.2f", num1, num2, ((double)num1 / num2));
                break;
            default:
                System.out.print("Такое действие отсутствует.");
        }


    }
}
