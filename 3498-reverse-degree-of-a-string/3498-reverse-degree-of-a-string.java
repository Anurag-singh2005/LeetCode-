class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int i=1;
        for(char c:s.toCharArray()){
            int val=c-'a';
            int t=26-val;
            int p=t*i;
            sum+=p;
            i++;
        }
        return sum;
    }
}