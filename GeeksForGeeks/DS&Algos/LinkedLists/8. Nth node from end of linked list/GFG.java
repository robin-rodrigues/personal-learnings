class GfG
{
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    int getNthFromLast(Node head, int n)
    {
    	Node first = head;
    	while(n-->1&&first.next!=null){
    	    first = first.next;
    	}
    	
    	Node second = head;
    	while(first.next!=null){
    	    first = first.next;
    	    second = second.next;
    	}

    	if(n==0) return second.data;
    	
    	return -1;
    }
}