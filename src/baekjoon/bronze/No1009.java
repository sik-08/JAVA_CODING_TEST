package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1009 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int[] results = new int[T];
        int a, b;

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            int result = a;

            if(b == 1)
                result = result % 10;
            else
                for(int j = 1; j < b; j++){
                result = (result * a) % 10;
            }

            if(result == 0) result = 10;

            results[i] = result;
        }

        for(int n : results) System.out.println(n);
    }
}
