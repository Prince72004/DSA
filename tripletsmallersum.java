import java.util.*;

class tripletsmallersum {
    public static void main(String[] args) {

        int[] arr = new int[] { 5, 1, 3, 4, 7 };
        int sum = 12;
         Arrays.sort(arr);
        int count =0;
        
        for(int i=0;i<arr.length-2;i++){
            
            int j=i+1;
            int k=arr.length-1;
            
            while(j<k){
                int res=arr[i]+arr[j]+arr[k];
                
                if(res<sum){
                    
                   count += (k-j);
                   j++;
                }
                else 
                {
                  k--;  
                }
                
            }
            
        }
        System.out.println(count);

    }
}
