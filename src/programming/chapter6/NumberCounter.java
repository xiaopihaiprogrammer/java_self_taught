package programming.chapter6;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        System.out.println("Enter the intergers between the 1 and 100:");
        int []counter = new int [101];
        for (int i = 0;i<counter.length;i++){
            counter[i] = 0;
        }
        Scanner input = new Scanner(System.in);
        String [] arr = input.nextLine().split("\\s+");
        for (int i = 0;i<arr.length;i++){
            int number = Integer.parseInt(arr[i]);
            counter[number]++;
        }
        for (int i = 1;i<counter.length;i++){
            if (counter[i]  > 0){
                System.out.println(i+" occurs "+counter[i]+" times ");
            }

        }

    }
}
