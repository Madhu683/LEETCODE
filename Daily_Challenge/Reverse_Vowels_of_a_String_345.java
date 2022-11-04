class Solution {
    
    public boolean checkVowel(char a)
    {
        switch(a)
        {
            case 'a': return true;
            case 'A': return true;
            case 'e': return true;
            case 'E': return true;
            case 'i': return true;
            case 'I': return true;
            case 'o': return true;
            case 'O': return true;
            case 'u': return true;
            case 'U': return true;
        }
        return false;
    }
    
    public String reverseVowels(String s) {
        
        if(s.length()<=1) return s;
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        int j=sb.length()-1;
        
        while(i<j)
        {
            char a = sb.charAt(i);
            char b = sb.charAt(j);
            
            if(checkVowel(a) && checkVowel(b))
            {
                sb.setCharAt(i,b);
                sb.setCharAt(j,a);
                i++;
                j--;
                
            }
            else if(checkVowel(a))
            {
              j--;  
            }
            else if(checkVowel(b))
            {
              i++;
            }
            else
            {
                i++;
                j--;
            }
            
            System.out.println(a+" "+b);
        }
        
        return sb.toString();
    }
    
}
