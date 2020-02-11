package sin_2020_2_11;

import java.util.Arrays;

public class Solution2 {
    // 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
//    初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
//    你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素.

    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = 0;
//        int j = 0;

//        if(nums1[m-1] < nums2[0]){
//            for(int i = 0;i < n;i++){
//                nums1[m] = nums2[i];
//                m++;
//            }
//        }
//
//        if(nums1[0] > nums2[n-1]){
//            for(int i = m-1;i>=0;i++){
//                nums1[i+n] = nums1[i];
//            }
//        }
//
        int i = 0;
        int j = 0;
        int index = 0;
        int[] num = new int[m+n];

        while(i < m && j < n){
            num[index++] = (nums1[i]<nums2[j])?nums1[i++]:nums2[j++];
        }

        if(i < n){
            System.arraycopy(nums2,i,num,index,n-i);
        }
        if(j < m){
            System.arraycopy(nums1,j,num,index,n-i);
        }

        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }
}
