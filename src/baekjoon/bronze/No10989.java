package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No10989 {
    public static void main(String[] args) throws IOException {
        int N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int[] ary = new int[N];

        for(int i = 0; i < ary.length; i++){
            ary[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ary);

        for (int j : ary) {
            System.out.println(j);
        }
    }
}
