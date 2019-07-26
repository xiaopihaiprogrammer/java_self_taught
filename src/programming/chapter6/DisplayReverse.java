package programming.chapter6;

import java.util.Scanner;

public class DisplayReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int [10];
        int  i = 0;
        System.out.println("请输入10个数字");
        while (i<10){
            arr[i] = input.nextInt();
            i++;
        }
        System.out.println("输入完成，接下来展示逆序输出");
        for (int j = arr.length-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
    }
}
