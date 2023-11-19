import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предложение ");
        String text = scanner.nextLine();
        char str = 0;

        char str1 = findMiddleCharacter(text);
        System.out.println("Cредний символ предложения:" + str1);

    }

    public static char findMiddleCharacter(String str) {

        return str.charAt((str.length() - 1) / 2);
    }


}
        
        