package javaAlgorithm.basic;

public class Page30 {
    public static void main(String[] args){
        int n = 7;

        method1(n);
        method2(n);
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
}
