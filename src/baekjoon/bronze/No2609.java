package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2609 {
    public static void main(String[] args) throws IOException {
        int n1, n2;
        int L, G;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());

        int temp1 = n1;
        int temp2 = n2;
        int result;

        while((result = temp1 % temp2) != 0){
            temp1 = temp2;
            temp2 = result;
        }

        G = temp2;
        L = n1 * n2 / G;

        System.out.println(G);
        System.out.println(L);
    }
}
