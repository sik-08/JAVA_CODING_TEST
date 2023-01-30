package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class No1264 {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(!(str = br.readLine()).equals("#")){
            for(int i = 0; i < str.length(); i++){
                switch (str.charAt(i)){
                    case 'a', 'e', 'i', 'o', 'u' -> cnt++;
                    case 'A', 'E', 'I', 'O', 'U' -> cnt++;
                }
            }
            list.add(cnt);
            cnt = 0;
        }
        for(int n : list) System.out.println(n);

        br.close();
    }
}
