import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int firstTerm, result, commonDifference = 0, numberOfTerms = 0;
        do{
            System.out.println("Make sure to write natural numbers! \nWrite the first term: ");
            firstTerm = scanner.nextInt();
            if(firstTerm>0) {
                System.out.println("Write the common difference: ");
                commonDifference = scanner.nextInt();
                if(commonDifference>0){
                    System.out.println("Write the number of terms: ");
                    numberOfTerms = scanner.nextInt();
                }
            }
        }while(numberOfTerms <= 0);

        result = firstTerm;
        for(int i =0; i<numberOfTerms; i++){
            System.out.print(result + "\t");
            result += commonDifference;
        }
    }
}
