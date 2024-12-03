package data_structures;
import java.util.Scanner;

public class doublylist {
	
	
	ListNode head;
	
	static class ListNode{
		int data;
		ListNode pre;
		ListNode next;
		
		ListNode(int data){
			this.data=data;
			this.pre=null;
			this.next=null;
		}
		
	}
	
	public static void main(String args[]) {
		
		doublylist obj=new doublylist();
		Scanner input=new Scanner(System.in);
		
		obj.head=new ListNode(10);
		int n=5;
		ListNode temp=obj.head;
		temp.next=null;
		System.out.println("Enter data");
		for(int i=0;i<n;i++) {
			
			int val=input.nextInt();
			ListNode data=new ListNode(val);
			temp.next = data;  // Link current node to new node
			data.pre = temp;   // Set the new node's `pre` pointer to the current node
			temp = data;       // Move the `temp` pointer to the new node

		}
		
		System.out.println("Display");
		 temp=obj.head;
		for(int v=0;v<n;v++) {
			
			System.out.print("-->"+temp.data);
			temp=temp.next;
		}
		
		
		
	}

}
