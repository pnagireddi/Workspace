package assignment4;

public class Problem1 {

	public static void main(String[] args) {
           // Remove duplicates from given string.
		
		String input=new String("aaabbbcccddd");
		String output=new String();
		for(int i=0;i<input.length();i++) {
			int j=0;
			for( j=0;j<i;j++) {
				if(input.charAt(i)==input.charAt(j)) {
					break;
				}
			}
			if(i==j) {
				output=output+input.charAt(i);
				
			}
		}
		System.out.println(output);
	}
		

}
