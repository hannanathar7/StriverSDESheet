package StackAndQueue;

import java.util.*;



class LFUCache {
	
	int minFreq,capacity,currSize;
	HashMap<Integer,DoublyLinkedList> freqmap=new HashMap<>();
	HashMap<Integer,Node> map=new HashMap<>();
    

    public LFUCache(int cap) {
        capacity=cap;
        currSize=0;
        minFreq=0;
    }
    
    public int get(int key) {
    	
    	if(!map.containsKey(key))
        return -1;
    	
    	else
    	{
    		Node node=map.get(key);
    		updateNode(node);
    		return node.value;
    	}
    }
    
    public void put(int key, int value) {
        
    	if(map.containsKey(key))
    	{
    		Node node=map.get(key);
    		node.value=value;
    		updateNode(node);
    	}
    	else
    	{
    		currSize++;
    		if(currSize>capacity)
    		{
    			DoublyLinkedList minFreqList=freqmap.get(minFreq);
    			map.remove(minFreqList.tail.prev.key);
    			minFreqList.removeNode(minFreqList.tail.prev);
    			currSize--;
    		}
    		minFreq=1;
    		
    		Node node=new Node(key,value);
    		DoublyLinkedList currList=freqmap.getOrDefault(1, new DoublyLinkedList());
    		currList.addNode(node);
    		freqmap.put(1, currList);
    		map.put(key, node);
    		
    		
    	}
    	
    }
    
    public void updateNode(Node node)
    {
    	int currFreq=node.freq;
    	DoublyLinkedList currList=freqmap.get(currFreq);
    	currList.removeNode(node);
    	freqmap.put(currFreq,currList);
    	 
    	if(currFreq==minFreq && currList.listSize==0)
    		minFreq++;
    	
    	node.freq++;
    	
    	DoublyLinkedList newList=freqmap.getOrDefault(node.freq,new DoublyLinkedList());
    	newList.addNode(node);
    	freqmap.put(node.freq, newList);
    	
    }
    
    
    
    
    public class Node
    {
    	int key,value,freq;
    	Node prev,next;
    	
    	Node(int k,int v)
    	{
    		key=k;
    		value=v;
    		freq=1;
    		prev=null;
    		next=null;
    	}
    }
    
    public class DoublyLinkedList
    {
    	int listSize;
    	Node head,tail;
    	
    	DoublyLinkedList()
    	{
    		head=new Node(0,0);
    		tail=new Node(0,0);
    		listSize=0;
    		head.next=tail;
    		tail.prev=head;
    	}

		public void removeNode(Node node) {
			
			node.prev.next=node.next;
            node.next.prev=node.prev;
             node.next=null;
			 node.prev=null;
			 listSize--;
			
		}

		public void addNode(Node node) {
			
			 Node headNext=head.next;
		        head.next=node;
		        node.prev=head;
		        node.next=headNext;
		        headNext.prev=node;
		        listSize++;
		}
		
		
    }
    
    public static void main(String args[])
    {
    	
    }
}
    

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */