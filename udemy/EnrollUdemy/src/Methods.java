public class Methods extends ClassesAndObjects	/**	extends command means to call another class here
													but don't call your friend a cunt
													for the love of God, please don't
												*/
{
	public static void main(String[] args)
	{
		Person person1 = new Person();
		person1.name = "Irvan Malik";
		person1.age = 17;
		
		Person person2 = new Person();
		person2.name = "Annisa Mafiro";
		person2.age = 17;
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		
		System.out.println(person2.name);
		System.out.println(person2.age);
		
		person1.speak();
		person2.speak();
	}
}
