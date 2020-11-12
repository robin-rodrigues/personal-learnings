class GfG
{
    public static Node reverse(Node head, int k)
    {
        if(head==null||head.next==null)
            return head;
        
        Node prev = null;
        Node next = null;
        Node curr = head;
        int counter = k;
        
        while(counter-->0&&curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        if(head!=null)
            head.next = reverse(next,k);
            
        return prev;
    }
}