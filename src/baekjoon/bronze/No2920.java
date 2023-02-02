package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2920 {
    public static void main(String[] args) throws IOException {
        int[] ascending = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] descending = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = new int[8];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < result.length; i++){
            result[i] = Integer.parseInt(st.nextToken());
        }
        String str;

        if(result[0] == 1){
            str = isAscending(result);
        }
        else if(result[0] == 8){
            str = isDescending(result);
        }
        else{
            str = "mixed";
        }

        System.out.println(str);
    }

    private static String isAscending(int[] ary){
        for(int i = 0; i < ary.length; i++){
            if(ary[i] != (i + 1)) return "mixed";
        }

        return "ascending";
    }

    private static String isDescending(int[] ary){
        int cnt = 8;
        for(int i = 0; i < ary.length; i++){
            if(ary[i] != (cnt--)) return "mixed";
        }

        return "descending";
    }
}
