package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class No1259 {
    public static void main(String[] args) throws IOException {
        String number;
        ArrayList<String> numbers = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while(!(number = input.readLine()).equals("0")){
            numbers.add(number);
        }

        input.close();

        for(String n : numbers){
            switch(n.length()){
                case 1 -> printYes();
                case 2 -> {
                    if(n.charAt(0) == n.charAt(1))
                        printYes();
                    else
                        printNo();
                }
                case 3 -> {
                    if(n.charAt(0) == n.charAt(2))
                        printYes();
                    else
                        printNo();
                }
                case 4 -> {
                    if(n.charAt(0) == n.charAt(3) && n.charAt(1) == n.charAt(2))
                        printYes();
                    else
                        printNo();
                }
                case 5 -> {
                    if(n.charAt(0) == n.charAt(4) && n.charAt(1) == n.charAt(3))
                        printYes();
                    else
                        printNo();
                }
            }
        }
    }

    private static void printYes(){
        System.out.println("yes");
    }

    private static void printNo(){
        System.out.println("no");
    }
}
