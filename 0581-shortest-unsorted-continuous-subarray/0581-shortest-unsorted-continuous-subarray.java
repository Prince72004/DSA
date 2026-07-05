class Solution {
    public int findUnsortedSubarray(int[] nums) {
       int start =-1;
       int end=-2;
       int max=nums[0];
       int min=nums[nums.length-1];

       for(int i=1;i<nums.length;i++){
        max=Math.max(max, nums[i]);
        if(max>nums[i]){
            end=i;
        }
       }

        for(int j=nums.length-2;j>=0;j--){
        min=Math.min(min, nums[j]);
        if(min<nums[j]){
            start=j;
        }
       }

       

        return end-start+1;
    }
}