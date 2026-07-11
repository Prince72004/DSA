class Solution {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>>  res=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();

     combination(1, n,  k, temp, res);  
     return res;             
       
        
    }
    private static void combination(int start ,int n, int k, ArrayList<Integer> temp,  ArrayList<List<Integer>>  res){
        if(temp.size()==k){
            res.add(new ArrayList(temp));
            return;
        }

        for(int i=start;i<=n;i++){
            temp.add(i);
            combination(i+1, n,  k, temp, res);               
             temp.remove(temp.size()-1);

        }
    }
}