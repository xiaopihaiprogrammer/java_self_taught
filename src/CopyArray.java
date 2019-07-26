public class CopyArray {
    public static void main(String[] args) {

        int [] sourseArray = new int [] {2,3,1,5,10};
        int [] targetArray = new int [sourseArray.length];
        //方法一
//        for (int i = 0;i<sourseArray.length;i++){
//            targetArray[i] = sourseArray[i];
//        }
//        for (int item:targetArray){
//            System.out.print(item+" ");
//        }
        //方法二
        System.arraycopy(sourseArray,0,targetArray,0,sourseArray.length);
        for (int item:targetArray){
            System.out.print(item+" ");
        }
        //方法三
//        clone方法，后期再学


    }
}
