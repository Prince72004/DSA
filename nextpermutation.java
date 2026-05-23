class nextpermutation{


    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,2,1};

        int i=nums.length-2;

        while(i>=0&&nums[i]>nums[i+1]){
            i--;
        }
if(i>=0){
        int j=nums.length-1;
        while(nums[i]>=nums[j]){
            j--;
        }

        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
           int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;

            left++;
            right--;
        }
        for(int num:nums){
 System.out.println(num);
        }
       
    }





}