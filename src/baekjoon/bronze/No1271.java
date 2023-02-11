package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class No1271 {
    public static void main(String[] args) throws IOException{
        String str1, str2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        str1 = st.nextToken(); str2 = st.nextToken();
        BigInteger n = new BigInteger(str1);
        BigInteger m = new BigInteger(str2);
        BigInteger result1 = n.divide(m);
        BigInteger result2 = n.mod(m);
        System.out.println(result1);
        System.out.println(result2);
    }
}
