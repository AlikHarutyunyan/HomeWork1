import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loopCount = 0;
        int primeNumberQuantity;
        int currentNumber = 2;
        boolean isPrime = true;

        do{
            System.out.println("Write a number higher than 0: ");
            primeNumberQuantity = scanner.nextInt();
        }while(primeNumberQuantity < 1);

        while (loopCount < primeNumberQuantity) {
            for(int i = 2; i <= currentNumber/2; i++){
                if (currentNumber % i == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if(isPrime){
                System.out.print(currentNumber + " ");
                loopCount++;
            }
            currentNumber++;
        }
    }
}