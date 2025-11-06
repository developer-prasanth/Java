abstract class A
{
	 abstract void B();
} 
class C extends A
{
	public void B()
{
	System.out.println("Hello");
}
}
class D extends A
{
public void B()
{
System.out.println("Hi");
}
}
class Abstract
{
	public static void main(String args[])
	{
		D m1=new D();
		m1.B();
		C s1=new C();
		s1.B();
	}
}

