
public class Dog 
{
	int age;
	String name;
	String color;
	String breed;
	int weight;
	int bark_num;
	
	//constructor
	public Dog()
	{
		age = 0;
		name = "leo";
		color = "brown";
		breed = "caucasian mtn shepard";
		weight = 200;
		bark_num = 0;
	}
	
	void running ()
	{
		for(int a = 0; a<5; a+=2)
		{
			System.out.println( name + " is running");
		}
	}
	void bark ()
	{	
		for(int b = 0; b<2; b++)
		{
		      System.out.println( name + " is barking");
		      bark_num ++;
		}
		
	}

}
