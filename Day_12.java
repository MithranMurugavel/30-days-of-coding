package data_structures;

public class Sorting2 {
	
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

		 int[] array1= {2,4,6,8,10};
		 int[] array2= {1,3,5,7,9};
		
		Sorting2 obj=new Sorting2();
		
		int[] result=obj.mergetwosortedarray(array1,array2);
		for(int i=0;i<10;i++) {
			System.out.print(result[i]+" ");
		}
		

	}

}
