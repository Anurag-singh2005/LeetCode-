class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0];
        
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            int min=Integer.MAX_VALUE;
            for(int t=i;t<nums.length;t++){
                min=Math.min(min,nums[t]);
            }
            if(max-min<=k){
                return i;
            }
        }
        return -1;
    }
}