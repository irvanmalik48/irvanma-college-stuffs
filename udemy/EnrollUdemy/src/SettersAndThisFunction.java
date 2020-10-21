class Frog
{
	String name;
	int age;
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setNameOther(String name)
	{
		this.name = name;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	public void setAgeOther(int age)
	{
		this.age = age;
	}
	
	public void setBoth (String name, int age)
	{
		setName(name);
		setAge(age);
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
}

public class SettersAndThisFunction
{
	public static void main(String[] args) 
	{
		Frog frog1 = new Frog();
		frog1.name = "Kiko";
		frog1.age = 15;
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		
		frog1.setName("Syifa");
		frog1.setAge(10);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		
		frog1.setNameOther("Tanta");
		frog1.setAgeOther(17);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		
		frog1.setBoth("Annis", 17);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
	}
}
