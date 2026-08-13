class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int sum=0;
        int n=nums.length;

        while(j<n){
            sum+=nums[j];
            while(target<=sum){
                minLen=Math.min(minLen,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        int ans=minLen==Integer.MAX_VALUE?0:minLen;
        return ans;
    }
}