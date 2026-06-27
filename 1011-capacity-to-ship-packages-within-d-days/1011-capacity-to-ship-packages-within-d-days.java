class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;

        for(int n:weights){
            left=Math.max(left,n);
            right += n;
        }

        while(left<=right){
            int mid=(left+right)/2;

          int d=helper(weights,mid);


            if(d>days){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }


return left;
        
    }
    private static int helper(int[] arr,int capacity){
        int days=1;
        int currentload=0;
        
        for(int c:arr){
            if(c+currentload >capacity){
                days++;
                currentload=0;
            }
            currentload +=c ;
        }
        return days;
    }
}