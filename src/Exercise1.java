import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float firstParameter, secondParameter, thirdParameter;
        double firstAnswer, secondAnswer;

        System.out.println("Write your first number: ");
        firstParameter = scanner.nextFloat();
        System.out.println("Write your second number: ");
        secondParameter = scanner.nextFloat();
        System.out.println("Write your third number: ");
        thirdParameter = scanner.nextFloat();

        double quadEquationPart = Math.sqrt(secondParameter * secondParameter - 4 * firstParameter * thirdParameter);
        firstAnswer = (-secondParameter + quadEquationPart)/2*firstParameter;
        secondAnswer = (-secondParameter - quadEquationPart)/2*firstParameter;

        if(firstAnswer >= 0 || firstAnswer < 0){
            if(secondAnswer != firstAnswer){
                System.out.println("Solved! There are 2 answers: x1 = "+ firstAnswer + " x2 = " + secondAnswer);
            }else{
                System.out.println("Solved! There is one answer: x1 = " + firstAnswer);
            }
        }else{
            System.out.println("Unfortunately, there is no answer!");
        }
    }
}