class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        int i=1;
        while(true){
            int check=k*i;
            if(!arr.contains(check)){
                return check;
            }
            i++;
        }

    }
}