class Solution {
    public List<String> topKFrequent(String[] words, int k) {
     
        HashMap<String,Integer> map = new HashMap();
        for(String w:words) map.put(w,map.getOrDefault(w,0)+1);
        
        map = sortByValue(map);
        
        List<String> list = new ArrayList<String>();
        for(String s:map.keySet())
        {
            if(k==0) break;
            list.add(s);
            k--;
        }
        return list;
    }
    
    public HashMap<String,Integer> sortByValue(HashMap<String,Integer> map)
    {   //fill the list with map entries
        List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
        
        //sort the list with customized comparator
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2)
            {
               return (o1.getValue()).compareTo(o2.getValue())==0?(o1.getKey()).compareTo(o2.getKey()):(o2.getValue()).compareTo(o1.getValue());
            }
        });
        
        
        HashMap<String,Integer> tempMap = new LinkedHashMap<String,Integer>();
        
        //fill map with sorted entries of map
        for(Map.Entry<String,Integer> e:list)
        {
            tempMap.put(e.getKey(),e.getValue());
        }
        return tempMap;
        
        
    }
}