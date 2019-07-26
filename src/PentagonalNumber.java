public class PentagonalNumber {
    public static int getPentagonalNumber(int n){
        return n*(3*n-1)/2;
    }
    public static void main(String[]args){
        final int NUM_PER_LINE = 10;
        final int TOTAL = 100;
        for (int i = 0;i<TOTAL;i++){
            int num = PentagonalNumber.getPentagonalNumber(i+1);
            if ((i+1) % NUM_PER_LINE == 0){
                System.out.printf("%6d\n",num);
            }else{
                System.out.printf("%6d",num);
            }
        }

    }
}
