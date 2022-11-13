package strings.Programs;

public class Solution {
	 public String removeDuplicateLetters(String s) {
		 

         // Remove duplicates from given string.
		
		
		String output=new String();
		for(int i=0;i<s.length();i++) {
			int j=0;
			for( j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					break;
				}
			}
			if(i==j) {
				output=output+s.charAt(i);
				
			}
		}
		char[] ch=output.toCharArray();
            for(int i=0;i<ch.length;i++) {
        	
        	for(int j=1;j<ch.length-i;j++) {
        		if(ch[j-1]>ch[j]) {
        			//s=s.replace(s.charAt(j-1), s.charAt(j));
        			char temp=ch[j];
        			ch[j]=ch[j-1];
        			ch[j-1]=temp;
        		}
        		
        	}
        	
        }
            String result=new String(ch);
            
            return result;

	
	 }
	   
	 
	 
	 
	 public static void main(String[] args){
	        
	        Solution ss=new Solution();
	        String s= "cbacdcbc";
	       System.out.println(ss.removeDuplicateLetters(s)); 
	    }

}
