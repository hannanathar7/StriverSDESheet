package LinkedList;



public class Add2NumbersLeetcode {
	
	public static ListNode head;
	
	public static void main(String args[])
	{
		head=new ListNode(2);
		head.next=new ListNode(5);
		head.next.next=new ListNode(8);
	
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
	      

        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        int c=0;
        while(l1!=null || l2!=null || c>0)
        {
            int sum=0;
            if(l1!=null)
            {
                sum+=l1.val;
                l1=l1.next;
            }

            if(l2!=null)
            {
                sum+=l2.val;
                l2=l2.next;
            }

            sum+=c;
            c=sum/10;
            sum=sum%10;

            ListNode node=new ListNode(sum);
            prev.next=node;
            prev=prev.next;
        }

        return dummy.next;

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



