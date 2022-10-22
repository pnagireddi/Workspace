
public class Launch1_6 {

	public static void main(String[] args) {
		int n=11;
	     for(int i=0;i<n;i++)
	     {
	    	 
	    	 // To practice
	    	 for(int j=0;j<n;j++)
	    	 {
	    		 if(i==0||
	    				 i==(n-1)||
	    				 j==0||
	    				 (i+j<=(n-1)/2)||
	    				 (i-j>=(n-1)/2)) {
	    			System.out.print("*"); 
	    		 }
	    		 else {
	    			 System.out.print(" ");
	    		 }
	    		 
	    	 }
	    	 System.out.println();
	    	 
	     }
	}

}
