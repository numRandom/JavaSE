package sin_2020_2_11;

public class Solution1 {
    public int lengthOfLastWord(String s) {
        String[] str = s.trim().split(" ");
        if(str.length == 0){
            return 0;
        }
        return str[str.length-1].length();
    }
}
