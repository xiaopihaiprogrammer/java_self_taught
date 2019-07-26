public class Swap {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        String.valueOf(3);
    }
    public static void main (String [] args){
        int a = 1;
        int b = 3;
        System.out.println("交换前a,b的值为："+a+","+b);
        Swap.swap(a,b);
        System.out.println("交换后a,b的值为："+a+","+b);
    }
}
