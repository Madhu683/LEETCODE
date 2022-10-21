//Approach 1-->Using brute force
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        int n = nums.length;
        for(int i=0;i<n;i++)
        {   
            for(int j=i+1;j<=i+k && j<n;j++)
            {
                if(nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }
}
//Time complexity:O(n^2)
//Space complexity:O(1)

//Approach 2-->Using brute force
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
       HashSet<Integer> set = new HashSet<Integer>();
       for(int i=0;i<nums.length;i++)
       {
           if(i>k) set.remove(nums[i-k-1]);
           
           if(!set.add(nums[i])) return true;
       }
      return false;
    }
}
//Time complexity:O(n)
//Space complexity:O(n)
