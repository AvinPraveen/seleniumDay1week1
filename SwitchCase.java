package Week1.day1;

//import java.util.Scanner;

public class SwitchCase 
{
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Addition type w , subtration type f, Multiply typ d");
		//char input =sc.next().charAt(0);
		int a=10,b=5;
		 String input="add";

		
		switch (input) 
		{
			//case 'w':
		case "add":
			int r= a+b;
			System.out.println("Addition of two number: " +r);
			
			break;
			//case 'f':
		case "sub":
			int s= a+b;
			System.out.println("Subtration of two number: " +s);
			
			break;
			//case 'd':
		case "mul":
			int m= a+b;
			System.out.println("Multiply of two number: " +m);
			
			break;

		default:
			int d= b/a;
			System.out.println("Multiply of two number: " +d);
			
			
		}
		// TODO Auto-generated method stub

	}

}
