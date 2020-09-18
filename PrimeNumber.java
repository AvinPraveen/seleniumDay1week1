package Week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13;
		boolean flag=true;
		for (int i = 2; i <a ; i++)
		{
			if(a%i==0)
			{
				flag=false;
				break;
				
			}					
		}
		if(flag)
		{
			System.out.println(+a + " given input is Prime number");
		}
		else
			
		{
			System.out.println(+a+" given number is not Prime Number");
		}

	}

}
