public class Exercise7 {
    public static void main(String[] args) {

        int digit;
        int sum=0;
        int resDigits=1;
        int count=0;
        int temp1;
        int temp2;

        for (int i=0; i<=1000; i++) {

            temp1=i;
            while (temp1 != 0) {
                temp1 /= 10;
                count++;
            }

            temp2=i;
            while (temp2 != 0) {

                digit = temp2 % 10;
                for (int j = 1; j <= count; j++) {
                    resDigits = resDigits * digit;
                }

                sum = sum + resDigits;

                temp2/=10;
                resDigits=1;
            }

            count = 0;
            if (sum==i) {
                System.out.println(sum);
            }
            sum = 0;
        }
    }
}
