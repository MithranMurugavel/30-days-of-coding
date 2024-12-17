package data_structures;

public class Sorting2 {
	 void swap(int[] array,int i,int j) {
			
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		
	 
	 void quicksort(int[]array,int low,int high) {
		  if(low<high) {
			  
			  int part=partition(array,low,high);
			  
			  quicksort(array,low,part-1);
			  quicksort(array,part+1,high);
		  }
	 }
	
	int partition(int[] array,int low,int high) {
		
		int i=low,j=low;
		int pivot =array[high];
		
		while(i<=high) {
			if(array[i]<=pivot) {
				swap(array,i,j);
				j++;
			}
			i++;
		}
		return j-1;
	}
	
	void mergesort(int[] array,int low,int high) {
		
		
		if(low<high) {
			
			int mid =low +(high-low)/2;
			mergesort(array,low,mid);
			mergesort(array,mid+1,high);
			
			merge(array,low,mid,high);
		}
	}
	
	void merge(int[] array,int low,int mid, int high) {
		

		int len1=mid-low +1;
		int len2=high-mid;
		int[] left=new int[len1];
		int[] rigth=new int[len2];
		
		int i=0,j=0,k=low;
		
		for(int x=0;x<len1;x++) {
			left[x]=array[low+x];
		}
		
		for(int x=0;x<len2;x++) {
			rigth[x]=array[mid+x+1];
		}
        while(i<len1 && j<len2) {
			
			if(left[i]<rigth[j]) {
				array[k]=left[i];
				i++;
			}
			else {
				array[k]=rigth[j];
				j++;
			}
			k++;
		}
		while(i<len1) {
			array[k]=left[i];
			i++;k++;
			
		}
		while(j<len2) {
			array[k]=rigth[j];
			j++;k++;
		}
		
	}
	
	int[] mergetwosortedarray(int[] array1,int[] array2) {
		
		int len1=array1.length;
		int len2=array2.length;
		int[] result=new int[len1+len2];
		int i=0,j=0,k=0;
		
		while(i<len1 && j<len2) {
			
			if(array1[i]<array2[j]) {
				result[k]=array1[i];
				i++;
			}
			else {
				result[k]=array2[j];
				j++;
			}
			k++;
		}
		while(i<len1) {
			result[k]=array1[i];
			i++;k++;
			
		}
		while(j<len2) {
			result[k]=array2[j];
			j++;k++;
		}
		return result;
		
	}

	public static void main(String[] args) {

		
		int[] array= {4,3,2,1,5};
		Sorting2 obj=new Sorting2();
		
		obj.quicksort(array, 0, array.length-1);
		

		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		

	}

}
