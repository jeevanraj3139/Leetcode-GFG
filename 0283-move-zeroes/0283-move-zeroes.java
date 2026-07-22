class Solution {
    public void moveZeroes(int[] nums) {
        int zeros = 0;
        for(int i:nums){
            if(i==0){
                zeros++;
            }
        }
        int h =0;
        for(int j =0; j<nums.length; j++){
            if(nums[j] !=0){
                nums[h] = nums[j];
                h++;
            }
        }
        for (int i = 0; i < zeros; i++){
            nums[h] = 0;
            h++;
        }
    }
}