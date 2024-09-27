import java.util.Set;
import java.util.*;

public class Solution {
    /**
     * Determines if the input string can be segmented into dictionary words.
     * @param s The input string
     * @param wordDict The dictionary of valid words
     * @return true if the string can be segmented, false otherwise
     */    
    public static void main(String[] args){
    	Solution obj=new Solution();
   	Set<String> wordDict =new LinkedHashSet<String>();
   	wordDict.add("apple");
   	wordDict.add("pen");   		
   	System.out.println(obj.canBreak("applepenapple",wordDict));    	
    }
    
    public boolean canBreak(String s, Set<String> wordDict) {
        // Your implementation here
        int offset=0;
        int limit=0;
        String x;
        boolean flag=false;      
        for(String s1:wordDict){        	
       		limit=s1.length()+limit;        	     
        	if(limit<=s.length() && offset<=s.length()){
	       		x=s.substring(offset,limit);        	        	
	        	if(s1.equals(x)){        			
        			offset=limit;
        			flag=true;      		
        		}
        	}
        	else{
        		flag=false;
        	}
        }       
        return flag;
    }

    // You can add helper methods if needed
}



















