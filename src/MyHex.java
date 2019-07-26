import java.util.Scanner;

public class MyHex {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个十进制数");
        int decimal = scanner.nextInt();
//        System.out.println();
        System.out.print("转化过后的十六进制数是：0x"+DecimalToHex(decimal));

    }
    public static String DecimalToHex(int decimal){
        String hex = "";
        while (decimal != 0){
            int haxvalue = decimal % 16;
            hex = toHexChar(haxvalue)+hex;
            decimal = decimal / 16;
        }
        return hex;
    }
    public static char toHexChar(int hexvalue){
        if (hexvalue >= 0 && hexvalue <=9){
            return (char)(hexvalue + '0');
        }else{  //hexvalue >= 10 && hexvalue <=15    因为除数是16，hex
            return (char)(hexvalue - 10 + 'A');//产生A~E
        }
    }
}
