class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> res =new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
          ArrayList<Integer> temp =new ArrayList<>();


        permutation(nums,res,visited,temp);
        return res;

        
    }
    private static void permutation(int[] nums ,  ArrayList<List<Integer>> res, boolean[] visited,ArrayList<Integer> temp){

        if(nums.length==temp.size()){
            res.add(new ArrayList(temp));
            return ;
        }

        for(int i=0;i<nums.length;i++){

            if(visited[i]){
                continue;
            }
              visited[i]=true;
            temp.add(nums[i]);
            permutation(nums ,  res, visited, temp); // backtrack

            temp.remove(temp.size()-1);
            visited[i]=false;

        }
    }
}
