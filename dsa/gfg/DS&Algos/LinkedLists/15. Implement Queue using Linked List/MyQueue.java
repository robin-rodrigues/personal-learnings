/*The structure of the node of the queue is
class QueueNode
{
    int data;
    QueueNode next;
    QueueNode(int a)
    {
        data = a;
        next = null;
    }
}*/

class MyQueue
{
    QueueNode front, rear;
    
    // This function should add an item at
    // rear
	void push(int a)
	{
        // Your code here
        QueueNode temp = new QueueNode(a);
        if(front==null){
            front = temp;
            rear = temp;
            front.next = null;
            rear.next = null;
        }else if(front == rear){
            front.next = temp;
            rear.next = temp;
            rear = temp;
        }
        else{
            rear.next = temp;
            rear = temp;
        }
	}
	
    // This function should remove front
    // item from queue and should return
    // the removed item.
	int pop()
	{
        // Your code here
        if(front == null)
            return -1;
        int t = front.data;
        front = front.next;
        return t;
	}
}