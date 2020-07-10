import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
   
  	public static void preOrder( Node root ) {
      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }


	public static Node insert(Node root,int data) {
        Node n = new Node(data);
        if(root==null){
            return n;
        }

        Node curr = root;
        while(true){
            if(data<=curr.data){
                if(curr.left == null){
                    curr.left = n;
                    return root;
                }else{
                    curr = curr.left;
                }
            }else{
                if(curr.right == null){
                    curr.right = n;
                    return root;
                }else{
                    curr = curr.right;
                }
            }
        }
    	
    }

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
      	preOrder(root);
    }	
}