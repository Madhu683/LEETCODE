Approach 1
  
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
     
        if(nums.length<2) return false;
        
        for(int i=0;i<nums.length-1;i++)
        {
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum%k==0) return true;
            }
        }
        
        return false;
    }
}
  
//Time complexity:O(n^2)
//space complexity:O(1);
  
  
  
Approach 2

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
     
        HashMap<Integer,Integer> hm = new HashMap();
        hm.put(0,0);
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {   sum+=nums[i];
            if(!hm.containsKey(sum%k))
                hm.put(sum%k,i+1);
            else if(hm.get(sum%k)<i)
                return true;
        }
        return false;
    }
}

//Time complexity:O(n)
//space complexity:O(n);
