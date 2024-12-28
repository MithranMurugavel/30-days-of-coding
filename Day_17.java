class sample2{
	
	static void ShellSort(int[] array) {
		
		int length=array.length;
		
		for(int i=length/2;i>0;i/=2) {
			
			for(int k=i;k<length;k++) {

				int temp=array[k];// storing the mid pointer element
				int j;
				
			
			for(j=k;j>=i&& temp<array[j-i] ;j-=i) {
				
				// check from starting of the element 35 < 94
					array[j]=array[j-i]; 
				
			}
			array[j]=temp;
		}
	}
}
	
	static void Amstrong(int n) {
		int sum=0, count=0,num=n,r=0;
		
		while(num>0) {
			
			r=num%10;
			count++;
			num/=10;
		}
		int value=n;
		while(n>0) {
			r=n%10;
			sum=sum+(int)Math.pow(r,count);
			n/=10;
		}
		
		if(sum==value) {
			System.out.println("The number is amstrong number");
		}
		else {
			System.out.println("The number is not a amstrong number");
		}
	}

	
	public static void main(String args[]) {
	
		int[] arr = {46, 23, 78, 5, 12, 34, 56, 92, 1};
		
		System.out.println("Hello world");
		ShellSort(arr);
		for(int x:arr) {
			System.out.print(x+" ");
		}
    Amstrong(153);
		
	}
}
