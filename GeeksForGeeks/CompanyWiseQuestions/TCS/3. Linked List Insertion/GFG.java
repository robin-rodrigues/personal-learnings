// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class GFG{
    static void printList(Node node) 
    { 
        while (node != null) 
        { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
        System.out.println(); 
    }
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            Node head = null;
            for(int i=0; i<n; i++)
            {
                int value = sc.nextInt();
                int indicator = sc.nextInt();

                Solution ob = new Solution();
                if(indicator == 0)
                    head = ob.insertAtBeginning(head, value);
                else
                    head = ob.insertAtEnd(head, value);
            }
            printList(head); 
            t--;
        }
    } 
} 
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution
{
    // Should insert a node at the beginning
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node n = new Node(x);
        
        if(head == null){
            head = n;
            return head;
        }
            
        n.next = head;
        head = n;
        return head;
    }
    
    // Should insert a node at the end
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node n = new Node(x);
        if(head == null){
           head = n;
           return head;
        }
        
        Node t = head;
        while(t.next!=null){
            t = t.next;
        }
        t.next = n;
        return head;
    }
}