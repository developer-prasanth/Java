class Shape
{
float area;
void area(float length,float breadth)
{
this.area=length*breadth;
}
}
class Rectangle extends Shape
{
void parameters(float length,float breadth,float perimeter)
{
super.area(length,breadth);
System.out.print("Area of this rectangle is" +super.area);
}
}
class Box
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
r1.parameters(10.5f,11.5f,44f);
}
}
