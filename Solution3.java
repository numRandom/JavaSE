package sin_2020_2_10;

public class Solution3 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        int index = -1;

        while(left <= right){
            if(nums[left] < target && nums[right] > target){
                left++;
                right--;
            }
            if(nums[left] == target){
                index = left;
                break;
            }
            if(nums[right] == target){
                index = right;
                break;
            }
            if(nums[left] > target){
                index = left;
                break;
            }
            if(nums[right] < target){
                index = right+1;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {

    }
}
