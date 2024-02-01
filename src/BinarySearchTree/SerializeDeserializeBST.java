package BinarySearchTree;
import java.util.*;

public class SerializeDeserializeBST {

	public static class Node
	{
		int data;
		Node left;
		Node right;
		
		
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
			
		}
	}
	
	


	public String serialize(Node root) {

        if(root==null)
        return "";

        StringBuilder sb=new StringBuilder();
        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while(q.size()>0)
        {
            Node curr=q.remove();
            if(curr!=null)
            sb.append(curr.data+" ");
            else
            {
            sb.append("# ");
            continue;
            }

           
            q.add(curr.left);

      
            q.add(curr.right);

        }

        return sb.toString();
        
    }

    // Decodes your encoded data to tree.
    public Node deserialize(String data) {

        if(data.length()==0)
        return null;

        Queue<Node> q=new LinkedList<>();
        String s[]=data.split(" ");
        Node root=new Node(Integer.parseInt(s[0]));
        q.add(root);

        for(int i=1;i<s.length;i++)
        {
            Node curr=q.remove();

            if(!s[i].equals("#"))
            {
                Node left=new Node(Integer.parseInt(s[i]));
                curr.left=left;
                q.add(left);
            }
            i++;

             if(!s[i].equals("#"))
            {
                Node right=new Node(Integer.parseInt(s[i]));
                curr.right=right;
                q.add(right);
            }

        }


        return root;

        
    }
	}
	
	
	
	
	

