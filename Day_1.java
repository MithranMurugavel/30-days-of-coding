package sample1;
import java.util.*;

public class pothhole {
	
	public static void main(String args[]) {
		
		String str="...XXX..X....Xxx.";
		int len=str.length();
		int B=7;
		int count=0;
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<len;i++) {
			
			if(str.charAt(i)=='X' || str.charAt(i)=='x') {
				
				count++;
			}
			else {
				if(count>0) {
					list.add(count);
					count=0;
				}
				
			}
			
			
		}
		
			Collections.sort(list,Collections.reverseOrder());
			int result=0;
			for(int i=0;i<list.size();i++) {
				
				int val=list.get(i);
				
				if(val+1<=B) {
					
					B=B-(val+1);
					result+=val;
				}
				else {
					result+=B-1;
					break;
				}
			}
			
			System.out.println("The pothhole is: "+result);
			
			
		
	}

}
