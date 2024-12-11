package data_structures;

public class Sorting {
	
	//Simple Sorting algorithm
	
	void bubblesort(int[] array) {
		
		
		for(int i=0;i<array.length-1;i++) {
			boolean flag=false;
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j] >array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					flag=true;
				}
			}
			if(!flag) break;
		}
	}
	void insertionsort(int[] array) {
		for(int i=1;i<array.length;i++) {
			int max=array[i];
			int j=i-1;
			while(j >= 0 && array[j+1] >max ) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1]=max;
		}
	}
	void selectionsort(int[] array) {
		
		for(int i=0;i<array.length;i++) {
			int min=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[min]>array[j]) {
					min=j;
				}
			}
			int temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
	}
	

	public static void main(String[] args) {
		
		 int[] array= {3,1,5,2,6,4};
		
		Sorting obj=new Sorting();
		
		obj. bubblesort( array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		//obj.insertionsort(array);
			for(int i=0;i<array.length;i++) {
				System.out.print(array[i]+" ");
			}
			System.out.println();
		
			//obj.selectionsort(array);
			for(int i=0;i<array.length;i++) {
				System.out.print(array[i]+" ");
			}
		
		

	}

}
