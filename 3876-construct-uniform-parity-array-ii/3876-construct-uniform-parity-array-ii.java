class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallest=Integer.MAX_VALUE;
        int evencount=0;
        int oddcount=0;
        int n=nums1.length;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }

            smallest=Math.min(smallest,nums1[i]);
        }
        if(evencount==n || oddcount==n){
            return true;
        }
        if(smallest%2!=0){
            return true;
        }
        return false;
    }
}