
public class String_1 {

	public static void main(String[] args) {
		
		String str="Hello World";
		
		String result= CapsToSmall(str);
		System.out.println("The result is: "+result);

	}

	private static String CapsToSmall(String str) {

		StringBuilder str1=new StringBuilder("");
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if(c>='A' && c<='Z') c=(char) (c+32);
			str1.append(c);
		}
		
		return str1.toString();
	}

}
