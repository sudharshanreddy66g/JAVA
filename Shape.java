// abstract class

abstract class Shape
{
	// Abstract method
	
	abstract void draw();
}

//Concreate class

class Circle extends Shape
{

	void draw()
	{
	   System.out.println("Drwaing Circle");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
	   System.out.println("Drawing Rectangle");
	}
}