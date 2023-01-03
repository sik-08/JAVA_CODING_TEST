package basic;

//import java.util.Scanner;
//modified
public class Test1 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        double avg = 0.0;
        int cnt = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                sum += array[i][j];
                cnt++;
            }
        }
        avg = (double)sum / cnt;

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
        System.out.println("Hello");
    }
}