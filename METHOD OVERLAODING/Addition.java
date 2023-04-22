import java.util.*;
import java.io.*;
class Add
{
	int a,b,ai;
	float c,d,af;
	double e,f,ad;
	void add(int a,int b)
	{
		ai=a+b;
		System.out.println("Addition of two integer no="+ai);
	}
	void add(float c,float d)
	{
		af=c+d;
		System.out.println("Addition two Float values="+af);
	}
	void add(double e,double f)
	{
		ad=e+f;
		System.out.println("Addition of two double values="+ad);
	}
}

class Addition
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integer values=");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter two float values=");
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		System.out.println("Entre two doubled values=");
		double p=sc.nextDouble();
		double q=sc.nextDouble();
		Add ad=new Add();
		ad.add(a,b);
		ad.add(x,y);
		ad.add(p,q);
	}
}

