import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        int [] deck = new int [53];
        String [] cardType = {"红桃","黑桃","方片","梅花"};//deck的下标一个除数，一个余数  分别是cardtype和cardnum的下标
        String [] cardNum = {"尖","1","2","3","4","5","6","7","8","9","10","钩","圈","K"};
        //
        for (int i = 1;i<deck.length;i++){
            deck[i] = i;
        }
        for (int item:deck){
            System.out.print(item);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("请抽一张牌（1~52）");
        int randomNum = scanner.nextInt();
        while (randomNum >= 1 && randomNum <=52){
            int type = (int)(randomNum / 13);
            int num = randomNum % 13;
            System.out.println("哈哈，你抽到的牌是："+cardType[type]+cardNum[num]);
            randomNum = scanner.nextInt();
        }
    }
}
