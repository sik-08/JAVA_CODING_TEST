package javaAlgorithm.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Page30 {
    public static void main(String[] args) throws IOException {
        int n = 7;
        int a, b;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        method1(n);
        method2(n);
        method3(a, b);
    }

    private static void method1(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    private static void method2(int n){
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
    }

    private static void method3(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
