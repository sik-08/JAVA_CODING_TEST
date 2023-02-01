package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2480 {
    public static void main(String[] args) throws IOException {
        int[] dice = new int[3];
        int[] result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        for(int i = 0; st.hasMoreTokens(); i++){
            dice[i] = Integer.parseInt(st.nextToken());
        }

        result = searchResult(dice);
        System.out.println(result[0] + result[1] * result[2]);
    }

    private static int[] searchResult(int[] dice){
        if(dice[0] == dice[1]){
            if(dice[0] == dice[2]){
                return new int[]{10000, dice[0], 1000};
            }
            else{
                return new int[]{1000, dice[0], 100};
            }
        }
        else if(dice[0] == dice[2]){
            return new int[]{1000, dice[0], 100};
        }
        else if(dice[1] == dice[2]){
            return new int[]{1000, dice[1], 100};
        }

        if(dice[0] < dice[1]){
            if(dice[1] > dice[2]){
                return new int[]{0, dice[1], 100};
            }
        }
        else if(dice[0] > dice[2]){
            return new int[]{0, dice[0], 100};
        }

        return new int[]{0, dice[2], 100};
    }
}