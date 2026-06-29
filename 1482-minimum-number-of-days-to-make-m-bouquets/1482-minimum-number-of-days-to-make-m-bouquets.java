class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int left=0;
        int right=0;
        for(int i:bloomDay){
            left=Math.min(left,i);
            right=Math.max(right,i);
        }
int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;

            if(helper(bloomDay,mid, m,k)){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

       return ans;
        
    }
     private static boolean helper(int[] arr , int days, int m, int k){
            int flower=0;
            int bouquets=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<=days){
                    flower++;
                }
                else{
                    flower=0;
                }

                if(flower==k){
                    bouquets++;
                    flower=0;
                }
            }
            return bouquets>=m;
        }
}