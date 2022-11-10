import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int starCoordinate;
        int starStart;
        int starFinish;

        do {
            System.out.println("Write an odd number higher than 3: ");
            userInput = scanner.nextInt();
            if(userInput % 2 == 0){
                userInput = 0;
            }
        } while (userInput <= 3);

        starCoordinate = (userInput-1)/2;
        starStart = starCoordinate;
        starFinish = starCoordinate;

        for (int columnIndex = 0; columnIndex < userInput; columnIndex++) {
            for(int rowIndex=0; rowIndex<userInput; rowIndex++){
                if (rowIndex >= starStart) {
                    System.out.print("*");
                    if(rowIndex == starFinish){
                        break;
                    }
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();

            if(columnIndex < starCoordinate){
                starStart--;
                starFinish++;
                continue;
            }
            starStart++;
            starFinish--;

        }
    }
}
