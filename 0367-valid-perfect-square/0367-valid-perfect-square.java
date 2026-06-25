class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        int left=0;
        int right=num/2;
        long square=0;

        while(left<=right){
        int mid= (left+right)/2;
        square=(long) mid*mid;

        if(square==num){
            return true;
        }else if(square<num){
            left=mid+1;
        }
        else{
            right=mid-1;
        }

        }

        return  false;
        
    }
}