import java.util.*;
import java.io.*;
class Base
{
	void show()
	{
		System.out.println("Base class");
	}
}
class Derive extends Base
{
	void show()
	{
		System.out.println("Derive class");
	}
	void disp()
	{
		show();
		super.show();
	}
}

class Demo
{
	public static void main(String args[])
	{
		Derive d=new Derive();
		d.disp();
	}
}

