
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your text: ");
        String text = scanner.nextLine();
        int total = mess(text);
    }

    static int mess(String text) {
        System.out.println("Message:" + text);
        return 0;


    }
}




