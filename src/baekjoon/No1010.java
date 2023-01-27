package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1010 {
    public static void main(String[] args) throws IOException {
        // 0 < N <= M <= 30
        // 다리는 겹치면 안된다. (이전 인덱스에 접근할 수 없다.)

        int n, m, cnt;
        int[] result;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cnt = Integer.parseInt(br.readLine());
        result = new int[cnt];

        StringTokenizer st;

        for(int i = 0 ; i < cnt; i++){
            st = new StringTokenizer(br.readLine(), " ");

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            result[i] = calculate(n, m);
        }
        br.close();
    }

    private static int calculate(int n, int m){
        if(n <)
    }

    private static int factorial(int n){

    }
}
