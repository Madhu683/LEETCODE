class Solution {
    public int removeDuplicates(int[] nums) {
        
        int result[] = new int[nums.length];
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],1);
                nums[j++]=nums[i];
                
            }
        }
        
        return j;
    }
}
