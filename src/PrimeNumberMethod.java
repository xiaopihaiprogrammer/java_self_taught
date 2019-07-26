public class PrimeNumberMethod {
    public static void main(String[]args){
        System.out.println("请答应以下数量的素数：");
        printPrimeNumbers(50);

    }
    public static void printPrimeNumbers(int num){
        final int DISPLAY_NUM_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count<num){
            if (isPrime(number)){
                count++;
                if (count % DISPLAY_NUM_PER_LINE == 0){
                    System.out.printf("%-5s\n",number);
                }else {
                    System.out.printf("%-5s",number);
                }
            }
            number++;
        }
    }
    public static boolean isPrime(int num){
        for (int div = 2;div <= num /2; div++){
            if (num % div == 0){
                return false;
            }
        }
        return true;
    }
}
