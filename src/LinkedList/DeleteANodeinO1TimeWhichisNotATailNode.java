package LinkedList;



public class DeleteANodeinO1TimeWhichisNotATailNode {
	
public static ListNode head;
	
	public static void main(String args[])
	{
		head=new ListNode(2);
		head.next=new ListNode(5);
		head.next.next=new ListNode(8);
	
	}
	
	 public void deleteNode(ListNode node) {

	        node.val=node.next.val;
	        node.next=node.next.next;
	        
	    }
	
	
	public static class ListNode
	{
		
		int val;
		ListNode next;
		
		ListNode(int v)
		{
			val=v;
		}
		
	}
	
	
}



