import java.util.Scanner;

public class TheLongestNumString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int count = 0;
        int end = 0;
        int index = 0;
        String s = sc.nextLine();
        while(sc.hasNext()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    count++;
                    if (count > max) {
                        max = count;
                        end = i;//当前边的不好确定时，可以标记后边的
                    }
                } else {
                    count = 0;
                }
            }
            System.out.println(s.substring(end - max + 1, end + 1));//为什么end+1？——因为String.substring() 方法是前闭后开
        }
    }
}
