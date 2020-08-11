
class LinkedList
{
    Node sortedMerge(Node headA, Node headB) {
        if(headA == null)	return headB;
        else if(headB == null) return headA;

        Node currA = headA;
        Node currB = headB;
        Node firstDummyNode = new Node(0);
        Node n = firstDummyNode;

        while(currA!=null&&currB!=null){
        	if(currA.data<currB.data){
        		n.next = currA;
        		currA = currA.next;
        	}else{
        		n.next = currB;
        		currA = currB.next;
        	}
        }

        if(currA == null){
        	n.next = currB;
        }else{
        	n.next = currA;
        }

        return firstDummyNode.next;
   } 
}