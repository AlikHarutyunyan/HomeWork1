import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int sum;
        int A0 = 0;
        int A1 = 1;

        if (num==0) {
            System.out.println("The number is fibonacci");
        }

        else {
            do  {
                sum = A0 + A1;
                A0 = A1;
                A1 = sum;

                if (sum == num) {
                    System.out.println("The number is fibonacci");
                }

                else if (sum > num){
                    System.out.println("The number is not fibonacci");
                }
            } while (num>sum);
        }
    }
}
