import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int number1 = (int) scanner.nextDouble();
        System.out.print("Введите символ 2: ");
        int number2 = (int) scanner.nextDouble();
        System.out.print("Введите число 3: ");
        int number3 = (int) scanner.nextDouble();
        int total = averageOfThree(number1, number2, number3);

        System.out.println("Среднее значение из трех чисел равно:" + total);


    }

    static int averageOfThree(int number1, int number2, int number3) {
        double res = 0;
        res = (double) (number1 + number2 + number3) / 3;
        return (int) res;

    }

}
