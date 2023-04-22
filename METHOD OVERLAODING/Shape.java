import java.util.*;
import java.io.*;
class Area
{
	int s;
	float r;
	float b,h;
	int l,br;
	void area(int s)
	{
		System.out.println("Area of square="+s*s);
	}
	void area(float b,float h)
	{
		 double at=0.5*b*h;
		System.out.println("Area of triangle="+at);
	}
	void area(float r)
	{
		 double ac=3.14*r*r;
		System.out.println("Area of circle="+ac);
	}
	void area(int l,int br)
	{
		 float ar=l*br;
		System.out.println("Area of rectangle="+ar);
	}
}

class Shape{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of square=");
		int sq=sc.nextInt();
		System.out.println("Enter radious of circle=");
		float rd=sc.nextFloat();
		System.out.println("Enter base and height of traingle=");
		float bt=sc.nextFloat();
		float ht=sc.nextFloat();
		System.out.println("Enter length and breadth of rectangle=");
		int l=sc.nextInt();
		int br=sc.nextInt();
		Area a=new Area();
		a.area(sq);
		a.area(rd);
		a.area(bt,ht);
		a.area(l,br);
	}
}

		