class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

      ArrayList<Integer> res=new ArrayList<>();

      
      String digit="123456789";

      for(int len=2;len<=9;len++){// find length
        for(int start=0;start+len<=9;start++){

            int num=Integer.parseInt(digit.substring(start,start+len));
            if(num>=low && num<=high){
                res.add(num);
            }    
        }
      }
        return res;
    }
}