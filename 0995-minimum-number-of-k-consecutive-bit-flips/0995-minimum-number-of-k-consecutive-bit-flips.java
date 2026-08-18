class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int sol[] = new int[n+1];
        int flip = 0;
        int res = 0;
        //int ans = 0;
        for(int i =0;i<n; i++){
            flip += sol[i];
            if((nums[i] + flip)%2 == 0){
                if(i+k > n){
                    return -1;
                }
                flip++;
                res++;
                sol[i+k]--;
            }
        }
        return res;
    }
}