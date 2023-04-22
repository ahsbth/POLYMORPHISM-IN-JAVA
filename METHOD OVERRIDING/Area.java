import java.util.*;
import java.io.*;
class Rectangle
{
	Scanner sc=new Scanner(System.in);
	void area()
	{
		System.out.println("Enter length and bradth of rectangle=");
		int l=sc.nextInt();
		int b=sc.nextInt();
		float a=l*b;
		System.out.println("Area of rectangle="+a);
	}
}
class Traingle extends Rectangle
{
	void area()
	{
		System.out.println("Enter base and height of traingle=");
		float b=sc.nextFloat();
		float h=sc.nextFloat();
		double a=0.5*b*h;
		System.out.println("Area of triangle="+a);
	}
	void result()
	{
		area();
		super.area();
	}
}
class Area{
	public static void main(String args[])
	{
		Traingle t=new Traingle();
		t.result();
	}
}

		
		