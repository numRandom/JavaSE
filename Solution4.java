package sin_2020_2_10;

public class Solution4 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] words = new int[26];
        for(int i = 0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            words[ch - 'a']++;
        }
        int len = ransomNote.length();
        for(int i = 0;i<magazine.length() && len>0;i++){
            char ch = magazine.charAt(i);
            if(words[ch-'a'] != 0){
                words[ch - 'a']--;
                len--;
            }
        }
        return len==0;
    }
}
