/*
The structure of the node of the stack is
class StackNode
{
    int data;
    StackNode next;
    StackNode(int a)
    {
       data = a;
       next = null;
    }
}
*/

class MyStack {

    // Note that top is by default null
    // in Java
    StackNode top;

    void push(int a) {
        // Add your code here
        StackNode temp = new StackNode(a);
        
        if(top == null){
            top = temp;
        }else{
            temp.next = top;
            top = temp;
        }
        
    }
    int pop() {
        // Add your code here
        if(top==null)
            return -1;
        int t = top.data;
        top = top.next;
        return t;
    }
}