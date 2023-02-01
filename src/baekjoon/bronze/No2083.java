package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No2083 {
    public static void main(String[] args) throws IOException {
        class Member{
            final String name;
            String group;

            Member(String name){
                this.name = name;
                this.group = null;
            }
            @Override
            public String toString(){
                return String.format("%s %s", name, group);
            }
        }

        ArrayList<Member> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Member member;
        StringTokenizer st;
        String temp;

        while(!((temp = br.readLine()).charAt(0) == '#')){
            st = new StringTokenizer(temp, " ");
            member = new Member(st.nextToken());

            if(Integer.parseInt(st.nextToken()) > 17){
                member.group = "Senior";
            }
            else if(Integer.parseInt(st.nextToken()) >= 80){
                member.group = "Senior";
            }
            else{
                member.group = "Junior";
            }

            list.add(member);
            member = null;
        }
        br.close();
        for(Member m : list) System.out.println(m.toString());
    }
}
