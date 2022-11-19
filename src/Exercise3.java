import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.println("Write an odd number higher than 3: ");
            userInput = scanner.nextInt();
            if(userInput % 2 == 0){
                userInput = 0;
            }
        }while (userInput <= 3);

        int middleStar = (userInput-1)/2;
        int starLeft = middleStar;
        int starRight = middleStar;

        for (int columnIndex = 0; columnIndex < userInput; columnIndex++) {
            for(int rowIndex=0; rowIndex<userInput; rowIndex++){
                if (rowIndex >= starLeft) {
                    System.out.print("*");
                    if(rowIndex == starRight){
                        break;
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

            if(columnIndex < middleStar){
                starLeft--;
                starRight++;
            }else {
                starLeft++;
                starRight--;
            }
        }
    }
}
