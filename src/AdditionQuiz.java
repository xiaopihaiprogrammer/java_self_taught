import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[]args){
        int num1 = (int)(System.currentTimeMillis() % 10);
        int num2 = (int)(System.currentTimeMillis()* 7 % 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请猜测 "+num1+"+"+num2+"=");
        int result = scanner.nextInt();
        System.out.println(num1+"+"+num2+"="+result+"="+(num1+num2 == result));
    }
}
