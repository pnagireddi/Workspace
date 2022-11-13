package constructors;

public class Constructor {

	public static void main(String[] args) {

		// it will create empty string object.
		String s = new String();

		// create string literal object in heap area.
		String s1 = new String("Nagi");
		String intern = s1.intern();
		System.out.println(intern);

		// to covert char[] into string .
		char[] ch = new char[4];
		ch[0] = 'j';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';

		String s2 = new String(ch);
		System.out.println(s2);

		// to convert byte[] into string.
		byte[] b = new byte[4];
		b[0] = 65;
		b[1] = 66;
		b[2] = 67;
		b[3] = 68;
		String s3 = new String(b);
		System.out.println(s3);

		// to covert String buffer object into string.
		StringBuffer sb = new StringBuffer();
		sb.append("Nagi");

		String s4 = new String(sb);
		System.out.println(s4);

	}

}
