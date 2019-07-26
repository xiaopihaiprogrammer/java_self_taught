package programming.chapter7;

import java.util.Scanner;

public class FindNearestPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请确认要输入的点数：");
        int num = input.nextInt();

        double [][] points = new double[num][2];
        System.out.println("现在开始输入点》");
        for (int i = 0;i<points.length;i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        int p1 = 0;
        int p2 = 1;
        double shortestdist = getDistance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);
        System.out.println("shorteddistance is:"+shortestdist);
        double distance;
        for (int i = 0;i<points.length;i++){
            for (int j = i+1;j<points.length;j++){ //j 不能等于 i ,相等的话就取到同一个点了，距离就为 0 了
                distance = getDistance(points[i][0],points[i][1],points[j][0],points[j][1]);
                System.out.println(distance);
                if (distance < shortestdist ){
                    p1 = i;
                    p2 = j;
                    shortestdist = distance;

                }
            }
        }
        System.out.println("考的最近的两个点是（"+points[p1][0]+","+points[p1][1]+"）和（"+points[p2][0]+","+points[p2][1]+"），最短距离是"+shortestdist);
    }
    public static double getDistance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
}
