package data_structures;
import java.util.*;

import java.util.Queue;
import java.util.LinkedList;
class TreeDSA{
	
	 ListNode root;

public class ListNode{
	
	int data;
	ListNode left;
	ListNode right;
	
	ListNode(){}
	
	ListNode(int data){
		this.data=data;
		left=null;
		right=null;
	}
	
	
	
}
boolean isvalid(ListNode root,int min, int max) {
	
	
	if(root==null) return true;
	
	
	if(root.data<=min || root.data >= max) return false;
	
	boolean left=isvalid(root.left,min,root.data);
	if(left) {
		boolean right=isvalid(root.right,root.data,max);
		
		return right;
	}
	
	return false;
}
 


void levelorder() {
	
	if(root==null) return;
	
	Queue<ListNode> queue=new LinkedList<ListNode>();
	queue.offer(root); // add element to the queue;
	List<Integer> list=new ArrayList<>();
	while(!queue.isEmpty()) {
		
		ListNode temp=queue.poll();
		list.add(temp.data);
		
		if(temp.left!=null) {
			queue.offer(temp.left);
		}
		
		if(temp.right!=null) 
			queue.offer(temp.right);
		
	}
	System.out.print(list);
	}


public int findmax(ListNode root) {
	if(root==null) return Integer.MIN_VALUE;
	
	int result=root.data;
	int left=findmax(root.left);
	int right=findmax(root.right);
	
	if(left>result) result=left;
	
	if(right>result) result=right;
	
	return result;
}

public int findmin(ListNode root) {
	
	if(root==null) return Integer.MAX_VALUE;
	
	int result=root.data;
	int left =findmin(root.left);
	int right =findmin(root.right);
	
	if(right<result) result=right;
	
	if(left<result) result=left;
	
	return result;
}


public void  insert(int data) {
	
	ListNode temp=new ListNode(data);
	if(root==null) {
	root=temp;
	return;
	}
	  ListNode temp1 = root;
      ListNode parent = null;

      while (temp1 != null) {
          parent = temp1;
          if (data < temp1.data) {
              temp1 = temp1.left;
          } else {
              temp1 = temp1.right;
          }
      }

      if (data < parent.data) {
          parent.left = temp;
      } else {
          parent.right = temp;
      }
}


public void preorderstack(ListNode root)
{
	ListNode temp;
	if(root==null)
		return;
	Stack<ListNode> stack=new Stack<ListNode>();
	stack.push(root);
	while(!stack.isEmpty()) {
		temp=stack.pop();
		System.out.print(temp.data+"-->");
		if(temp.right!=null) {
			
			stack.push(temp.right);
		}
		if(temp.left!=null) {
			stack.push(temp.left);
		}
		
		
	}
}


public void inorderstack(ListNode root) {
	
	if (root==null)
		return;
	Stack<ListNode> stack=new Stack<ListNode>();
	//stack.push(root);
	ListNode temp=root;
	
	while(!stack.isEmpty() || temp!=null) {
		
		if(temp!=null) {
			
			stack.push(temp);
			temp=temp.left;
		}
		else {
			temp=stack.pop();
			System.out.print(temp.data+"-->");
			temp=temp.right;
		}
	}
	
	
}

public void inorder(ListNode root) {
	
	if(root==null)
		return;
	
	inorder(root.left);
	System.out.print(root.data+"-->");
	inorder(root.right);
}
public void preorder(ListNode root) {
	
	if(root==null)
		return;
	
	System.out.print(root.data+"-->");
	preorder(root.left);
	preorder(root.right);
	
}

}

public class  Tree{
	
	public static void main(String args[]) {
		
		int[] array= {10,5,4,3,44,32};
	TreeDSA obj=new TreeDSA();
	for(int i=0;i<6;i++) {
		
		obj.insert(array[i]);
	}
	
	obj.preorder(obj.root) ;
	System.out.print("null \n");
	obj.preorderstack(obj.root);
	System.out.print("null \n");
	obj.inorderstack(obj.root);
	System.out.print("null \n");
	obj.inorder(obj.root);
	System.out.print("null \n");
	int result=obj.findmax(obj.root);
	
	System.out.print("The max value is:"+result+"/n");
	int result1=obj.findmin(obj.root);
	System.out.print("The Minimum value is:"+result1);
	obj.levelorder();
	System.out.println("The result is: "+obj.isvalid(obj.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
	

	
	
	

     }
}
