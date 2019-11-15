import java.util.Scanner;

public class test0_11_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = numberApple(n);
        System.out.println(result);
    }

    private static int numberApple(int n) {
        int count = 0;
        if(n%8==0){
            return n/8;
        }
        if(n==6){
            return 1;
        }
        int m = n/8;
        int t = n%8;
        while(m>0 && t%6!=0){
            t+=8;
            m--;
            if(t%6==0) {
                return m + t / 6;
            }
        }
        return -1;
    }
}
