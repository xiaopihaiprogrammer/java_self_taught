package programming.chapter7;

public class TwoDemialArrays {
    public static void main(String[] args) {
        int [][] matrix = new int [5][5];
        for (int i = 0;i<5;i++){
            for (int j = 0;j<5;j++){
                matrix[i][j] = i*10+j;
            }
        }
        for (int i = 0;i<5;i++){
            for (int j = 0;j<5;j++){
                System.out.printf("%3s",matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++++++");
        for (int row = 0;row < matrix.length;row++){
            for (int col = 0;col<matrix[row].length;col++){
                System.out.printf("%3s",matrix[row][col]);
            }
            System.out.println();
        }
        System.out.println("对数组按列求和");
        for (int col = 0;col<matrix[0].length;col++){
            int total = 0;
            for (int row = 0;row<matrix.length;row++){
                total+=matrix[row][col];
            }
            System.out.println("第"+col+"列和为"+total);
        }
        System.out.println("求哪一行的和最大");
        int maxrow = 0;
        int indexOfMaxRow = 0;
        for (int col = 0;col<matrix[0].length;col++){
            maxrow+=matrix[0][col];
        }
        for (int row = 1;row<matrix.length;row++){
            int totalofrow = 0;
            for (int col = 0;col<matrix[0].length;col++){
                totalofrow+=matrix[row][col];
            }
            if (totalofrow>maxrow){
                maxrow = totalofrow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("最大行在第"+indexOfMaxRow+"行，该行的和是"+maxrow);
        System.out.println("随意打乱");
        for (int row = 0;row < matrix.length;row++){
            for (int col = 0;col<matrix[row].length;col++){
                System.out.printf("%3s",matrix[row][col]);
            }
            System.out.println();
        }
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                int k = (int)(Math.random() * matrix.length);
                int v = (int)(Math.random()*matrix[i].length);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[k][v];
                matrix[k][v] = temp;
            }
        }
        System.out.println("打乱后");
        for (int row = 0;row < matrix.length;row++){
            for (int col = 0;col<matrix[row].length;col++){
                System.out.printf("%3s",matrix[row][col]);
            }
            System.out.println();
        }
    }
}
