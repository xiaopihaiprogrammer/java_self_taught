public class MyArrays {
    public static void main(String[] args) {
        double [] arr1 = new double [] {6.5,5.7,3.9,0.9,1.2,3.3,4.5};
        char [] arr2 = new char[]{'4','1','7','6','3','2','8','9','7'};
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2,1,4);
        System.out.println(arr1.toString());
        System.out.println(arr2.toString());
    }
}
