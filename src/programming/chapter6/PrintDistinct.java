package programming.chapter6;

public class PrintDistinct {
    public static void main(String[] args) {
        int [] counter = new int [10];
        for (int i = 0;i<counter.length;i++){
            counter[i] = 0;
        }
        int [] array = new int [100];
        for (int i = 0;i<array.length;i++){
            array[i] = (int)(Math.random()* 10);
        }
        for (int item:array){
            counter[item]++;
        }
        for (int i = 0;i<counter.length;i++){
            System.out.println(i+"出现的次数"+counter[i]);
        }

    }
}
