class Revstring
{
public static void main(String[] args)
{
String str="Hello";
System.out.println("Original string:"+str);
StringBuffer str1=new StringBuffer(str);
str1.reverse();
String result=str1.toString();
System.out.println("Reversed string:"+result);
}
}
