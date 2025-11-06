import java.util.*;
public class BiggestOf3
{
	public static void main (String[] args)
	{
	int n1,n2,n3;	
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the first number:");
    n1=s.nextInt();
    System.out.print("Enter the second number:");
    n2=s.nextInt();
    System.out.print("Enter the third number:");
    n3=s.nextInt();
    if(n1>n2 && n1>n3)
    {
		System.out.print("Largest number:"+n1);
	}
	else if(n2>n1 && n2>n3)
	{
		System.out.print("Largest number:"+n2);
	}
	else if(n3>n1 && n3>n2)
	{
		System.out.print("Largest number:"+n3);
	}
	else
	{
		System.out.print("All the numbers are not distinct");
    }
    }

}
