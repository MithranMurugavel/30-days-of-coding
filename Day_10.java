package data_structures;
import java.util.Scanner;

public class heap {
	
	int[] node;
	int n;
	
	heap(int len){
		node=new int[len+1];
		n=0;
	}
	void resize( int cap) {
		
		int[] temp=new int[cap];
		for(int i=1;i<node.length;i++) {
			temp[i]=node[i];
		}
		node=temp;
	}
	
	void insert(int val) {
		
		if(n==node.length) {
			resize(2*node.length);
		}
		
		n++;
		node[n]=val;
		swim(n);
		
	}
	
	void swap(int i,int j) {
		int temp=node[i];
		node[i]=node[j];
		node[j]=temp;
	}
	
	int delete() {
		int max=node[1];
		swap(1,n);
		n--;
		sink(1);
		node[n+1]= 0;
		if(n>0 && (n == (node.length-1)/4)){
			resize(node.length/2);
		}
		return max;
	}
	void sink(int k) {
		
		while(2*k<=n) {
			int j=2*k;
			if(j<n && node[j] <node[j+1]) {
				j++;
			}
			if(node[k] >=node[j]) {
				break;
			}
			swap(k,j);
			k=j;
		}
	}
	void swim(int k) {//Add an new element to heap at leaf
		while(k>1 && node[k/2]<node[k]) {
			int temp=node[k];
			node[k]=node[k/2];
			node[k/2]=temp;
			k=k/2;
			}
	}
	
	void display() {
		for(int i=1;i<=n;i++) {
			System.out.println(node[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of input");
		
		n=in.nextInt();
		heap val=new heap(n);
		for(int i=0;i<n;i++) {
			val.insert(i*2);
		}
		val.display();

	}

}
                   
