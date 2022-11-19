public class Exercise7 {
    public static void main(String[] args) {
        int digit;
        int numberToCheck;
        int sum = 0;
        int digitsMultiplyResult = 1;
        int digitsCounter = 1;

        for (int currentNumber = 0; currentNumber <= 1000; currentNumber++) {
            numberToCheck = currentNumber;

            while(numberToCheck != 0){
                digit = numberToCheck % 10;
                numberToCheck /= 10;
                while(currentNumber/digitsCounter != 0){
                    digitsMultiplyResult *= digit;
                    digitsCounter *= 10;
                }

                sum += digitsMultiplyResult;
                digitsMultiplyResult = 1;
                digitsCounter = 1;
            }

            if(sum == currentNumber){
                System.out.println(sum);
            }
            sum = 0;
        }
    }
}
