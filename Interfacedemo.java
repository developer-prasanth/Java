interface Area
{
final static double pi=3.148;
double compute(float x,float y);
}
class Rectangle implements Area
{
public double compute(float x,float y)
{
return(x*y);
}
}
class Circle implements Area
{
public double compute(float x,float y)
{
return(pi*x*x);
}
}
class Interfacedemo
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
Circle c1=new Circle();
Area a1;
a1=r1;
System.out.println("area of the rectangle="+a1.compute(10,20));
a1=c1;
System.out.println("area of the circle"+a1.compute(10,0));
}
}
