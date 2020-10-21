class Person
{
	String name;
	int age;
	int semester;
	void speak()
	{
		System.out.println("Hello! My name is " + name + ". I'm " + age + " years old.");
	}
	
	void calculate()
	{
		int semestersLeft = 8 - semester;
		System.out.println("Semesters left until graduation is " + semestersLeft + " semester(s).");
	}
	
	int calculateNext()
	{
		int semestersLeft = 8 - semester;
		return semestersLeft;
	}
	
	int getAge()
	{
		return age;
	}
}

public class ClassesAndObjects 
{
	public static void main(String[] args)
	{
		return;
	}
}
