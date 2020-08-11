class LinkedList
{
    static Node segregate(Node head)
    {
        // add your code here
        int[] count = new int[3];
        Node curr = head;
        while(curr!=null){
            count[curr.data]++;
            curr = curr.next;
        }
        
        int i=0;
        curr = head;
        while(curr!=null){
            if (count[i] == 0) 
                i++; 
            else 
            { 
               curr.data= i; 
               --count[i]; 
               curr = curr.next; 
            } 
        }
        
        return head;
    }
}