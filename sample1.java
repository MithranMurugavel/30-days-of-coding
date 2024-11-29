package sample1;

public class sample1 {

	public static void main(String[] args) {
		
		int num[]= {120,24,71,10,59}; //output :3 6 
		int len=num.length;
		int[] result=new int[len];
		int data;
		int add=0;
		int mul=1;
		
		for(int i=0;i<len;i++) {
			data=num[i];
			int val=0;
			
			while(data!=0) {
				 
				val=data%10;
				data/=10;
				add+=val;
				mul*=val;
				
			}
			
			if(add>mul) {
				result[i]=add;
				System.out.println(add);
				add=mul=0;
			}
			else {
				result[i]=mul;
				System.out.print(mul);
				add=mul=0;

			}
			
		}
		
		
		

	}

}
