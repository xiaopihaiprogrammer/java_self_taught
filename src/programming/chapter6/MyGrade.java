package programming.chapter6;

import java.util.Scanner;

public class MyGrade {
    public static void main(String[] args) {
        System.out.print("Enter the number of students");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int [] arr = new int [num];
        System.out.println("Enter "+num+" scores");
        scanner.nextLine();
        String input = scanner.nextLine();
        System.out.println(input);
        int [] scores = new int [num];
        String [] str = input.split("\\s+");
        for (int i = 0;i<str.length;i++){
            int score = Integer.parseInt(str[i]);
            scores[i] = score;
        }
        int best = getBest(scores);
        for (int i = 0;i<num;i++){
            System.out.println("student"+i+"score is "+scores[i]+" and the grade is "+getGrade(best,scores[i]));
        }
    }
    public static char getGrade(int best,int score){
        if (score > best - 10){
            return 'A';
        }else if (score > best - 20){
            return 'B';
        }else if (score > best - 30){
            return 'C';
        }else if (score > best - 40){
            return 'D';
        }else{
            return 'E';
        }
    }
    public static int getBest(int [] arr){
        int max = arr[0];
        for (int i = 1;i<arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
