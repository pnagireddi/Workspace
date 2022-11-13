package strings.Programs;

public class sorting {

	public static void main(String[] args) {
        String s="dcba";
       char[] ch= s.toCharArray();
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
        System.out.println(ch);
	}

}
