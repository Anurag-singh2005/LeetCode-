class Solution {
    public int missingInteger(int[] nums) {
        ArrayList<Integer> num=new ArrayList<>();
        int seqsum=nums[0];
        for (int n:nums) {
            num.add(n);
        }
        int t=0;
        for(int i=1;i<num.size();i++){
            if(num.get(i) == num.get(i-1) + 1){
                seqsum+=num.get(i);
            }else{
                break;
            }
        }
        while(num.contains(seqsum)){
            seqsum++;
        }
        return seqsum;
    }
}