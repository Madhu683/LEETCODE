class Solution {
    public String sortString(String str)
    {
        char c[] = str.toCharArray();
        Arrays.sort(c);
        
        return new String(c);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new TreeMap<>();
        for(String s:strs)
        {
            String str = sortString(s);
            List<String> list;
            if(map.containsKey(str))
            {
                list = map.get(str);
                list.add(s);
                map.put(str,list);
            }
            else
            {
                list = new ArrayList<>();
                list.add(s);
                map.put(str,list);
            }
        }
        
        for( Map.Entry<String,List<String>> e : map.entrySet())
        {
            result.add(e.getValue());
        }
        
        return result;
        
    }
}
