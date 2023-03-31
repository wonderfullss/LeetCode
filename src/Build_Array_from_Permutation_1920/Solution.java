package Build_Array_from_Permutation_1920;

public class Solution {
    public int[] buildArray(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[nums[i]];
        }
        return array;
    }
}
