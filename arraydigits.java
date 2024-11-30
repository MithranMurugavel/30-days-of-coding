package sample1;

public class arraydigits {
	
	public static int[] digits(int[] arr) {
		
		int len=arr.length;
		
		for(int i=len-1;i>=0;i--) {
			
			if(arr[i]+1 != 10) {
				arr[i] =arr[i] + 1;
				return arr;
				
			}
			arr[i]=0;
		}
		
		int[] result=new int[arr.length+1];
		result[0]=1;
		return result;
		
	}

	public static void main(String[] args) {
		 int[] arr= {9,3,9};
		 
		
		 
		arr= digits(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		 
		 

	}

}
