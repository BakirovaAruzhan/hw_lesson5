import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int number = (int) scanner.nextDouble();
        System.out.print("Введите символ : ");
        char symb = scanner.next().charAt(0);
        System.out.print("Введите число : ");
        int number2 = (int) scanner.nextDouble();

        double res = myCalculator(number, number2);
        System.out.println(number + symb + "=" + res);
    }

    static double myCalculator(int number, int number2) {
        double res = 0;
        switch (number) {
            case '+':
                res = number + number2;
                break;
            case '-':
                res = number - number2;
                break;
            case '*':
                res = number * number2;
                break;
            case '/':
                res = (double) number / number2;
                break;
            default:
                System.out.println("что то не так ");
        }
        return res;
    }
}
