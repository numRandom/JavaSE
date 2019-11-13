//求两个数的最小公倍数
import java.util.Scanner;

public class TheSmallestGBshu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int t = GYNum(m,n);
        int result = 0;

        if(t!=1){
            m/=t;
            n/=t;
            result = t*m*n;
        }else{
            result=m*n;
        }
        System.out.println(result);
    }
    private static int GYNum(int m, int n) {
        int t = (m>n)?n:m;
        while(t>1){
            if(m%t==0 && n%t==0){
                return t;
            }
            t--;
        }
        return 1;
    }
}
