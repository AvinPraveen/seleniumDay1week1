package Week1.day1;

public class Calculator {
	int no1,no2;
	int sum,mul,subt;
	public void add(int numb1,int numb2) {
	no1=numb1;
	no2=numb2;
	sum=no1+no2;
	System.out.println("sum of two number :"+sum);

	}
	public void multiply(double nub1,double nub2) {
		double no1=nub1;
	double	no2=nub1;
	double mul;
		mul=no1*no2;
		System.out.println("multiple of two number :"+mul);

	}
	public void subtraction(int nu1,int nu2) {
		no1=nu1;
		no2=nu2;
		subt=no1+no2;
		System.out.println("subtaction of two number :"+subt);

		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ci= new Calculator();
		ci.add(5, 10);
		ci.multiply(15,10);
		ci.subtraction(10, 2);
	}

}
