class GfG
{
    int minEle;
    Stack<Integer> s = new Stack<Integer>();

    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	    if(s.empty())
	        return -1;
	    return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	    if(s.empty())
	        return -1;
	        
	    int p = s.pop();
	    if(p>=minEle)
	        return p;
	    else{
	       int min = minEle; 
	       minEle = 2*minEle - p;
	       return min;
	    }
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
	    if(s.empty()){
	        s.push(x);
	        minEle = x;
	        return;
	    }else{
	        if(x>=minEle)
	            s.push(x);
	        else{
	            s.push(2*x-minEle);
	            minEle = x;
	        }
	    }
    }	
}