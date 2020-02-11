package sin_2020_2_11;

// 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。

public class Solution5 {
    public int[] sortedSquares(int[] A) {
        int[] a = new int[A.length];

        int i = 0;
        int j = a.length - 1;
        int index = a.length - 1;

        while(i <= j){
            if(A[i]*A[i] <= A[j]*A[j]){
                a[index] = A[j]*A[j];
                j--;
            }else{
                a[index] = A[i] * A[i];
                i++;
            }
        }
        return a;
    }
}
