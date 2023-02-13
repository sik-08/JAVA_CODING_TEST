package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No15727 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int result;

        if(L % 5 != 0)  result = L / 5 + 1;
        else            result = L / 5;

        System.out.print(result);
    }
}
