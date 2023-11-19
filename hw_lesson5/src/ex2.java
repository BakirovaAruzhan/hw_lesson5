import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите число 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Введите число 3: ");
        int number3 = scanner.nextInt();

        int smallestNumber = smallestOfThree(number1, number2, number3);
        System.out.println("Наименьшее из чисел: " + smallestNumber);
    }

    static int smallestOfThree(int number1, int number2, int number3) {
        if (number1 < number2 && number1 < number3) {
            return number1;
        } else if (number2 < number1 && number2 < number3) {
            return number2;
        } else if (number3 < number1 && number3 < number2) {
            return number3;
        } else {
            System.out.println("Error: No smallest number found");
            return -1;
        }
    }
}
