package sin_2020_2_10;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String s = "";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch += 32;
            }
            s += ch;
        }
        System.out.println(s);
    }
}
