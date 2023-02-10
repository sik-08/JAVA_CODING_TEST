package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1157 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str;
        int[] mark = new int[26];
        int max, cnt = 0;
        char c;

        str = br.readLine().toUpperCase().toCharArray();

        for(char ch : str){
            int index = ch - 'A';
            mark[index]++;
        }

        max = mark[0];
        c = 'A';
        for(int i = 1; i < mark.length; i++){
            if(max == mark[i]){
                cnt++;
            }
            else if(max < mark[i]){
                max = mark[i];
                c = (char)(i + 65);
                cnt = 0;
            }
        }

        if(cnt == 0)    System.out.println(c);
        else            System.out.println("?");
    }
}
