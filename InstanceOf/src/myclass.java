//IMPORTANT
class base
{
	
}
class sub extends base
{
	
}
public class myclass extends sub
{
	
	public static void main(String args[])
	{
		myclass m=new myclass();
		if(m instanceof myclass)
		{
			System.out.println("myclass");
		}
		if(m instanceof sub)
		{
			System.out.println("sub");
		}
		if(m instanceof base)
		{
						System.out.println("base");
		}
		if(m instanceof Object)
		{
			System.out.println("Object");
		}

	System.out.println("**********************");
		base b=new sub();
		if(b instanceof base)
		{
			System.out.println("base");
		}
		if(b instanceof sub)
		{
			System.out.println("sub");
		}
		if(b instanceof myclass)
		{
			System.out.println("myclass");
		}
		if(b instanceof Object)
		{
			System.out.println("Object");
		}
	}
}




