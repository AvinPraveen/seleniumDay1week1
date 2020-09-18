package Week1.day2;

import java.util.Arrays;

// this is wrong can you help me 

public class MissingElementInArray
{

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,7,6,8};
		int sum=0;
        Arrays.sort(arr);	
	     for(int i=0;i<arr.length;i++)
	        {
	        	sum= sum+arr[i];    	
			}
	        System.out.println("Sum of array index :" +sum);
		     int sum1=0;
		for(int j=0;j<arr.length;j++)
		    {
					sum1=sum1+arr[j];
			}
	  System.out.println("Sum of array :"+ sum1);
	  System.out.println("Missing number: " +(sum1-sum));
	}	
}

