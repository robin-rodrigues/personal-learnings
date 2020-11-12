class Solution {

    public Node pairwiseSwap(Node head)
    {
        // code here
        Node curr = head;
        while(curr!=null&&curr.next!=null){
            int temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;
            curr = curr.next.next;
        }
        
        return head;
    }
}