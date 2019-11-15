import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test1_11_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Set<Character> litter = new HashSet<>();
        for(char ch:str2.toCharArray()){
            litter.add(ch);
        }
        for(char ch:str1.toCharArray()){
            if(!litter.contains(ch)){
                System.out.print(ch);
            }
        }
    }
}
