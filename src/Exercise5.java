import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();

        int nextNumber;
        int previousNumber = 0;
        int currentNumber = 1;

        if (userInput ==0) {
            System.out.println("The number is fibonacci");
        }

        else {
            do  {
                nextNumber = previousNumber + currentNumber;
                previousNumber = currentNumber;
                currentNumber = nextNumber;

                if (nextNumber == userInput) {
                    System.out.println("The number is fibonacci");
                }

                else if (nextNumber > userInput){
                    System.out.println("The number is not fibonacci");
                }
            } while (userInput > nextNumber);
        }
    }
}
