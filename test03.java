package Test_2020_2_12;

// 餐桌有 n 张桌子，每张桌子可容纳最多人数 a
// 有 m 批客人，b 人数，c 预计消费金额
//

import java.util.*;

public class test03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] desk = new int[n];
        int[][] t = new int[m][2];
        for(int i = 0;i<n;i++){
            desk[i] = sc.nextInt();
            list.add(desk[i]);
        }
        for(int i = 0;i < t.length;i++){
            t[i][0] = sc.nextInt();
            t[i][1] = sc.nextInt();
            //map.offer()
        }
    }
}
