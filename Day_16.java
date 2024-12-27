class Sample{
	static void digitpyramid(int n) {
		
		int r=1;
		int val;
		
		while(r<=n) {
			
			val=r;
			
			for(int i=1;i<=n-r;i++) {
				System.out.print('\t');
			}
			
			for(int i=1;i<=2*r-1;i++) {
				
				if(i<=(2*r)/2) {
					System.out.print("\t" + val++ );
				}
				else if(i==(2*r)/2 +1) {
					System.out.print("\t" + val);
				}
				else {
					System.out.print("\t" + --val);
				}
			}
			System.out.println();
			r++;
		}
	}
	
	static void perfectnumber(int n) {
		
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) sum=sum+i;
			
		}
		if(sum==n) 
			System.out.printf("The number %d is perfect number",n);
		else 
			System.out.printf("The number %d is not a perfect number",n);
	}
	
	static void primenumbercheck(int n) {
		
		int count=0;
		
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) count++;
		}
		if(count==0) System.out.println("Prime");
		
		else System.out.println("Not Prime");
		
	}
	static void primegenerate(int n) {
		
		
		
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=2;j<=i/2;j++) {
				
				if(i%j==0 ) {
					
					count++;
				}
			}
			if(count ==0 && i !=1) {
				System.out.print(i+" ");
				//count=0;
				
			}
			
		}
	}
	
	public static void main(String args[]) {
	
		System.out.println("Hello world");
//		primegenerate(20);
//		System.out.println();
//		perfectnumber(28);
	//	digitpyramid(6);
		
	}
}
