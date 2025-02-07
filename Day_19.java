class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
       int sum=0;
       int cal = len*(len+1)/2;
       for(int n:nums){
        sum+=n;
       } 
       if(sum == cal){
        return 0;
       }
       else{
        return cal-sum;
       }
    }
}
