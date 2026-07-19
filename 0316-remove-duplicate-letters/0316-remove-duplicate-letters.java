class Solution {
    public String removeDuplicateLetters(String s) {
        int [] last =new int [26];
        boolean [] used  =new boolean [26];

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            last[c-'a']=i;
        }
StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
              char c=s.charAt(i);

              if(used[c-'a']){
                continue;
              }
              while(res.length()>0 && 
              res.charAt(res.length()-1)>c 
              && last[ res.charAt(res.length()-1)-'a']>i){

                used[res.charAt(res.length()-1)-'a']=false;
                res.deleteCharAt(res.length()-1);
              }

            res.append(c);
              used[c-'a']=true;

        }


return res.toString();
        
    }
}