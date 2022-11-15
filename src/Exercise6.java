import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int digit;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNumber = scanner.nextInt();

        while(userNumber > 0) {
            digit = userNumber % 10;
            userNumber = userNumber / 10;
            sum+= digit;
        }
        System.out.println(sum);
    }
}
