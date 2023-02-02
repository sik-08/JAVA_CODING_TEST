package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1969 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N, M, H = 0;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        char[][] dna = new char[N][M];

        for(int i = 0; i < N; i++){
            dna[i] = br.readLine().toCharArray();
        }

        int T, A, G, C;
        char[] result = new char[M];

        for(int i = 0; i < M; i++){
            int max = 0;
            T = 0; A = 0; G = 0; C = 0;

            for(int j = 0; j < N; j++){
                switch(dna[j][i]){
                    case 'T' -> T++;
                    case 'A' -> A++;
                    case 'G' -> G++;
                    case 'C' -> C++;
                }
            }

            max = A;
            result[i] = 'A';
            if(C > max) {
                max = C;
                result[i] = 'C';
            }
            if(G > max) {
                max = G;
                result[i] = 'G';
            }
            if(T > max) {
                max = T;
                result[i] = 'T';
            }
            System.out.print(result[i]);
        }
        System.out.println();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(result[j] != dna[i][j]) H++;
            }
        }
        System.out.println(H);
    }
}
