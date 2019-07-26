public class EachSum {
    public static int getSumOfEach(String num){
        char arr[] = new char[num.length()];
        arr = num.toCharArray();
        int sum = 0;
        for (char item:arr){
            System.out.println(item);
            int number = (int)item-48;
            sum += number;
        }
        return sum;
    }
    public static void main (String [] args){
        int sum = EachSum.getSumOfEach("123456789");
        System.out.println("结果是"+sum);
    }
}
