import java.util.*;
import java.io.*;
class Find
{
	int s;
	float b;
	double c;
	void find(int s)
	{
		System.out.println("Square of no="+s*s);
	}
	void find(float b)
	{
		System.out.println("Squareroot of no="+Math.sqrt(b));
	}
	void find(double c)
	{
		System.out.println("cube of no="+c*c*c);
	}
}
class Calculate
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first no=");
		int a=sc.nextInt();
		System.out.println("Enter second no=");
		float b=sc.nextFloat();
		System.out.println("Enetr third no=");
		double c=sc.nextDouble();
		Find f=new Find();
		f.find(a);
		f.find(b);
		f.find(c);
	}
}

		
		
	