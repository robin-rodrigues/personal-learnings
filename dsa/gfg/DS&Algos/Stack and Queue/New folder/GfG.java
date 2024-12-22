// In java function tour() takes two arguments array of petrol
// and array of distance
class GfG
{
    int tour(int petrol[], int distance[])
    {
	// Your code here	
	    int deficit = 0, cal = 0, start=0;
	    
	    for(int i=0;i<petrol.length;i++){
	        cal += petrol[i] - distance[i];
	        
	        if(cal<0){
	            start = i+1;
	            deficit += cal;
	            cal = 0;
	        }
	    }
	    
	    return (cal+deficit>0)?start:-1;
    }
}

/*
petrol = [4,6,7,4]
distance = [6,5,3,5]
deficit = 0, cal = 0, start = 0
i=0: 
cal = -2
start = 1
deficit = -2
cal = 0

i=1:
cal = 1

i=2:
cal = 5

i=3:
cal = 4

*/