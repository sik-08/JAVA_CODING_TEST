package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class No2338 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str1 = br.readLine();
        String str2 = br.readLine();
        BigInteger a = new BigInteger(str1);
        BigInteger b = new BigInteger(str2);
        sb.append(a.add(b)).append('\n').append(a.subtract(b)).append('\n').append(a.multiply(b));
        System.out.println(sb);
    }
}
