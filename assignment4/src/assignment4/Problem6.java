package assignment4;

public class Problem6 {
    // To implement Pangram.
	public static void main(String[] args) {

		String s = "the quick brown fox jumps over lazydog";
		String ss = s.replace(" ", "");
		char[] ch = ss.toCharArray();
		int ar[] = new int[26];
		boolean flag = false;
		for (int i = 0; i < ch.length; i++) {
			//int index=ch[i]-97;
			ar[ch[i]-97]++;
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				System.out.println("it is not panagram");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("It is panagram");
		}

	
	}

}
