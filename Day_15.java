package sample;

public class LeetCode28 {
	
	static boolean substring(String str,String str1) {
		int count=0;
		int pos=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i) == str1.charAt(pos) && pos!=str1.length()-1) {
				count+=1;
				pos++;
				continue;
			}
			else {
				if(count==str1.length()-1) {
					return true;
				}
				count=0;
				pos=0;
			}
			
		}
		
		
		
		return false;

	}

	public static void main(String[] args) {

		String input="sadbutsad";
		String input1="sad";
		
		System.out.println("The result is: "+substring(input,input1));

	}

}
