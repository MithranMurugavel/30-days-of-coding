public class Day_5 {
	
	//This count the consecutive numbers occured in he array number

	public static void main(String[] args) {
		
		int arr[]= { 1, 9, 3, 10, 4, 20, 2}; //The output will be: 4
		
		for(int i=0;i<arr.length;i++) {
			
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
		int longstrike=0;
		int currentstrike=1;
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i] !=arr[i-1]) {
				
				if(arr[i]==arr[i-1]+1) {
					currentstrike+=1;
				}
				else {
					longstrike=Math.max(longstrike,currentstrike);
					currentstrike=1;
				}
			}
		}
		
			System.out.print(longstrike+" ");

	}

}
