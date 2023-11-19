import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        double number = scanner.nextDouble();

        double res = number * number;
        System.out.println("Результат:" + res);


    }

}

