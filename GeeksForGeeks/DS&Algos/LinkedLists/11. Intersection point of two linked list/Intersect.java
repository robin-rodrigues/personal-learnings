class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
        Node currA = headA;
        Node currB = headB;
        
        while(currA!=currB){
            if(currA == null){
                currA = headB;
            }else{
                currA = currA.next;
            }

            if(currB == null){
                currB = headA;
            }else{
                currB = currB.next;
            }
        }

        return currA.data;
	}
}