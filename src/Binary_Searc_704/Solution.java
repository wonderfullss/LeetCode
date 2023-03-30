package Binary_Searc_704;

public class Solution {
    public int search(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int hight = nums.length - 1;
        while (low <= hight) {
            int mid = low + (hight - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                hight = mid - 1;
            } else if (nums[mid] == target) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
