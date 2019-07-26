package programming.chapter6;

import java.util.Scanner;

public class AnalysisGrade {
    public static void main(String[] args) {
//        int [] arr = new int[11];

//        for (int i = 0;i<arr.length;i++){
//            arr[i] = 0;
//        }
        int [] numbers = new int[100];
        int j = 0;
        int count1 = 0;
        int count2 = 0;
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while (number>= 0 && number <= 10){
            System.out.print("请输入一个成绩：");
            number = input.nextInt();
            numbers[j] = number;
            j++;
            if (j == 100){
                break;
            }
        }
        int avg = getAvg(numbers);
        for (int i = 0;i<numbers.length;i++){
            if (numbers[i]>0){
                if (numbers[i] < avg){
                    count1++;
                }else{
                    count2++;
                }
            }

        }
        System.out.println("有 "+count1+"个数小于平均数，有"+count2+"个数大于平均数,平均数是"+avg);
//        for (int item:numbers){
//            System.out.print(item+" ");
//        }

    }
    public static int getAvg(int[]arr){
        int sum = 0;
        int i = 0;
        while (arr[i]>0){
            sum+=arr[i];
            i++;
        }
        return sum / i;
    }
}
