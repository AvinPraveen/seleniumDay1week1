package Week1.day1;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int calculated=0,remainder,original;  
	    int input=153;//It is the number to check armstrong  
	    original=input;  
	    while(input>0)  
	    {  
	    	remainder=input%10;  
	    input=input/10;  
	    calculated=calculated+(remainder*remainder*remainder);  
	    }  
	    if(original==calculated)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not an armstrong number");
	}
}

