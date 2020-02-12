package Test_2020_2_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 输入n个整数，找出其中最小的k个整数

public class test02_02_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){

        }
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0;i<k;i++){
            for(int j = i+1;j<input.length;j++){
                if(input[i] > input[j]){
                    swap(input,i,j);
                }
            }
            res.add(input[i]);
        }
        return res;
    }

    private void swap(int[] input, int i, int j) {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }
}
