import java.util.*;
import java.io.*;
class Square
{
	
	void find(int s)
	{
		System.out.println("Perimeter of square="+(4*s));
	}
}
class Circle extends Square
{
	
	void find(float r)
	{
		double c=2*3.14*r;
		System.out.println("Curcumference of circle="+c);
	}
	void result(int s)
	{
		find(s);
		super.find(rd);
	}
	
}
class Parameterised
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of square=");
		int s=sc.nextInt();
		System.out.println("Enter radious of circle=");
		float rd=sc.nextFloat();
		Circle c=new Circle();
		c.result();
		
	}
}

