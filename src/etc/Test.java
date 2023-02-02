package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException{
        int[] ary = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");

        int i = 0;
        for(String s : str){
            ary[i] = Integer.parseInt(s);
            if(ary[i] == 9){
                ary[i + 1] = ary[i] + 1;
                break;
            }
            i++;
        }
        System.out.println(Arrays.toString(ary));
    }
}
