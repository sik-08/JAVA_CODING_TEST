package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2609 {
    public static void main(String[] args) throws IOException {
        int n1, n2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());

        int check = 0;
        int L, G;

        for(int i = 1; i < Math.min(n1, n2); i++){
            if((n1 % i == 0) && (n2 % i == 0)) check = i;
        }

        G = check;
        L = n1 * n2 / G;

        System.out.println(G);
        System.out.println(L);
    }
}
