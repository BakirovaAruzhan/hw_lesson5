import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Positive ");
        } else
            System.out.println("Negative");
    }
}

