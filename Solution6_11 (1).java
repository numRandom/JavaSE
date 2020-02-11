package sin_2020_2_11;

//给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。

public class Solution6 {
    public String reverseOnlyLetters(String S) {
        int i = 0;
        int j = S.length() - 1;
        char[] str = S.toCharArray();

        while(i <=j){
            while(!Character.isLetter(str[i]) && i<j){
                i++;
            }
            while(!Character.isLetter(str[j]) && i<j){
                j--;
            }
            char tmp = str[i];
            str[i] = str[j];
            str[j] = tmp;
            i++;
            j--;
        }
        return str.toString();
    }
}
