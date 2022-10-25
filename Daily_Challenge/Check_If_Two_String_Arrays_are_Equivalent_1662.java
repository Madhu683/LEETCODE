//Approach -1
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 ="";
        String str2 ="";
        
        for(String s: word1) str1+=s;
        for(String s: word2) str2+=s;
        
        if(str1.equals(str2)) return true;
        
        return false;
    }
}

//Time complexity:O(n);
//Space complexity:O(1);


//Approach 2
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        
        for(int i=0;i<Math.max(word1.length,word2.length);i++)
        {
            if(i<word1.length) str1.append(word1[i]);
            if(i<word2.length) str2.append(word2[i]);
            
        }
        return (str1.toString()).equals(str2.toString());
    }
}

//Time complexity:O(max(m,n))
//Space complexity:O(1)
