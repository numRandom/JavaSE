package Test_2020_2_12;

// 找出字符串中，连续最长的数字字符

import java.util.Scanner;

public class test1_2020_02_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            int i = 0;    // 记录目前数字字符串的长度
            int max = 0;  // 记录最长的数字字符串长度
            int index = 0; // 记录最长数字字符串的起始位置
            for(int j = 0;j<str.length();j++){
                if((str.indexOf(j) >='0' && str.indexOf(j) <= '9')) {
                    i++;
                    if (i > max) {
                        index = i;
                        max = i;
                    }
                }
            }
            System.out.println(str.substring(index,index+max));
        }
    }
}
