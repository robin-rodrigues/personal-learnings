class Rotate{
    // This function should rotate list counter-
    // clockwise by k and return head node
    
    public Node rotate(Node head, int k) {
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        
        Node end = head;
        while(k-->0){
            end = head;
            head = head.next;
        }
        
        end.next = null;
        return head;
    }
}