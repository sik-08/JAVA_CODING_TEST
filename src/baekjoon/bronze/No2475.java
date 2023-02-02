package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; st.hasMoreTokens(); i++){
            result += (int)Math.pow(Integer.parseInt(st.nextToken()), 2);
        }
        br.close();

        System.out.println(result % 10);
    }
}
