package programming.chapter6;

public class TestOverride {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        double [] arr2 = {1.1,2.0,3.7,4.8,9.9};
        System.out.println(average(arr));
        System.out.println(average(arr2));

    }
    public static int average(int [] array){
        if (array!=null && array.length > 0){
            int sum = 0;
            for (int item:array){
                sum += item;
            }
            return sum / array.length;
        }
        return 0;
    }
    public static double average(double [] array){
        if (array!=null && array.length > 0){
            double sum = 0;
            for (double item:array){
                sum += item;
            }
            return (double) (sum / array.length);
        }
        return 0;
    }
}
