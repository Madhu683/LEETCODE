class Solution {
    public int checkUnique(String s)
    {
        HashSet<Character> hs = new HashSet<Character>();
        int i=0;
        for(int j=0;j<s.length();j++)
        {
            if(!hs.add(s.charAt(j))) return 0;
            i++;
            
        }
        return i;
    }
    public int maxLength(List<String> arr) {
        
        int n = arr.size();
        int max =0;
        for(int i=0;i<(1<<n);i++)
        {   
            String str="";
            
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                    str+=arr.get(j);
            }
            int c = checkUnique(str);
            max = c>max?c:max;
        }
        return max;
    }
}
