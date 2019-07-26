package equal;

public class Test {
    public static void main(String[]args){
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Object cat3 = new Object();
        if (cat.equals(cat3)){
            System.out.println("这两货是同一只猫！");

        }else{
            System.out.println("不是同一只猫！");
        }
    }
}
