package data_structures;

public class Sorting3 {
	
	
	 void swap(int[] array,int i,int j) {
		
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	 
	 void dutchflag(int[] array) {
		
		int i=0,j=0,k=array.length-1;
		
		while(i<=k) {
			
			if(array[i]==0) {
				swap(array,i,j);
				i++;
				j++;
			}
			else if(array[i]==1) {
				i++;
			}
			else if(array[i]==2){
				swap(array,i,k);
				k--;
			}
		}
	}

	public static void main(String[] args) {
		
		 int[] array= {0,2,1,0,1,2};
		 
		 for(int i=0;i<array.length;i++) {
			 System.out.print(array[i] +" ");
		 }
		 System.out.println();
		Sorting3 obj=new Sorting3(); 
		obj.dutchflag(array);
		 for(int i=0;i<array.length;i++) {
			 System.out.print(array[i] + " ");
		 }
		 
	}

}
