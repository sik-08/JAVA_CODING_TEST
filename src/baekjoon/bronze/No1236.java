package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N, M;
        int securities = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        char[][] status = new char[N][M];

        for(int i = 0; i < status.length; i++){
            status[i] = br.readLine().toCharArray();
        }

        boolean[] rowCheck = new boolean[N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(status[i][j] == 'X'){
                    rowCheck[i] = true;
                    break;
                }
            }
        }

        boolean[] colCheck = new boolean[M];
        for(int j = 0; j < M; j++){
            for(int i = 0; i < N; i++){
                if(status[i][j] == 'X'){
                    colCheck[j] = true;
                    break;
                }
            }
        }

        int rowCheckEmpty = 0, colCheckEmpty = 0;

        for(boolean n : rowCheck){
            if(!n) rowCheckEmpty++;
        }

        for(boolean n : colCheck){
            if(!n) colCheckEmpty++;
        }

        if(rowCheckEmpty > colCheckEmpty) securities = rowCheckEmpty;
        else securities = colCheckEmpty;

        System.out.println(securities);
    }
}