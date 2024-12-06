package data_structures;

public class Queue {

	
	ListNode front;
	ListNode rear;
	int length=0;
	
	private class ListNode{
		
		int data;
		ListNode next;
		
		ListNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	void insert(int data) {
		ListNode temp=new ListNode(data);
		if(front==null) front=temp;
		else {
			
			rear.next=temp;
		}
		rear=temp;
		length++;
	}
	
	int display() {
		
		if(front==null)
			return -1;
		
		ListNode temp=front;
		
		do {
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}while(temp!=null);
		
		System.out.println();
		return 1;
	}
	
	
	int deletef() {
		
		if(front==null)
			return -1;
		int val=front.data;
		front=front.next;
		length--;
		return val;
		
	}
	
	
	int deleteb() {
		
		if(front==rear)
			return -1;
		ListNode temp=front;
		while(temp.next!=rear)
			temp=temp.next;
		int val=rear.data;
		rear=temp;
		rear.next=null;
		length--;
		return -1;
		
		
		
	}
	
	public static void main(String args[]) {
		
		Queue q=new Queue();
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.insert(6);
		q.insert(7);
		
		q.display();
		
		q.deleteb();
		
		q.display();

	}
	
}


