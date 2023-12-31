class Solution {
    public String longestPalindrome(String str) {
        if(str.length()<=1)
			 return str;
		 String LPS="";
		 for(int i=1;i<str.length();i++)
		 {
			 //for odd length
			 int low=i;
			 int high=i;
			 while(str.charAt(low)==str.charAt(high))
			 {
				 low--;
				 high++;
				 if(low==-1 || high==str.length())
					 break;
			 }
			 String pali=str.substring(low+1,high);
			 if(pali.length()>LPS.length())
				 LPS = pali;
			 
			 //for even length
			 low=i-1;
			 high=i;
			 while(str.charAt(low)==str.charAt(high))
			 {
				 low--;
				 high++;
				 if(low==-1 || high==str.length())
					 break;
			 }
			 pali=str.substring(low+1,high);
			 if(pali.length()>LPS.length())
				 LPS = pali;
			 
		 }
		 return LPS;
        
    }
}