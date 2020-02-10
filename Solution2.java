package sin_2020_2_10;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[7];
        for(int i = 0;i<7;i++){
            n[i] = i + 1;
        }
        rotate(n,3);
    }

    public static void rotate(int[] nums, int k) {
        int[] num = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if((i+k) >= nums.length){
                int index = k - (nums.length-i);
                num[index] = nums[i];
            }
            num[i+k] = nums[i];
            System.out.println(num);
        }
    }
}
