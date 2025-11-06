import java.io.*;
import arithmetic.Operations;
class PackageTest
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Two numbers");
int a=Integer.parseInt(br.readLine());
 int b=Integer.parseInt(br.readLine());
 Operations o1=new Operations();
 o1.add(a,b);
 o1.sub(a,b);
 o1.mul(a,b);
 o1.div(a,b);
 }
 }

