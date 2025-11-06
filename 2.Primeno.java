import java.util.*;
public class Primeno
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check prime number:");
		int num=sc.nextInt();
		if(num==2)
		{
			System.out.print(num+" is a prime number");
		}
		else
		{
			for(int i=1;i<=num;i++){
			if(num%i==0){
			count++;}}
		}
	if(count==2)
	{
		System.out.print(num+" is a prime number");
	}
	else
	{
		System.out.print(num+" is not a prime number");
	}
}
}

