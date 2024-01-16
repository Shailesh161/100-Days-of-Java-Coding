
package abstractpackage;

public class AbstractClasss 
{
	public static void main(String args[])
	{
		shape s1 =new circle(5);
		double circleArea=s1.calculatearea();
		System.out.println("Area of circle is:"+circleArea);
		
		shape s2=new rectangle(6,10);
		double rectangleArea=s2.calculatearea();
		System.out.println("Area of rectangle is :"+rectangleArea);
		
	}
}

abstract class shape
{
	public shape()
	{
		super();
	}
	abstract double calculatearea();
}

class circle extends shape
{
	private Integer radius;
	public circle()
	{
		super();
	}
	public circle(Integer radius)
	{
		//super();
		this.radius=radius;
	}
	
	double calculatearea()
	{
		return Math.PI*Math.pow(radius,2);
	}
}


class rectangle extends shape
{
	private Integer base;
	private Integer height;
	
	public rectangle(Integer base,Integer height)
	{
		//super();
		this.base=base;
		this.height=height;
	}
	
	double calculatearea()
	{
		return base*height;
	}
}
