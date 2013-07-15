
public class Tiger {

	private String color;
	private String size;
	private boolean eatspeople;
	private int age; 
	private int weightinlbs;
	public Tiger()
	{
		color = "orange with black and white stripes";
		size = "large";
		age = 59;
		eatspeople = true;
		weightinlbs = 670; 
	}
	
	String getColor()
	{
		return color;
		
	}
	
	void setcolor() 
	{
	
	
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isEatspeople() {
		return eatspeople;
	}

	public void setEatspeople(boolean eatspeople) {
		this.eatspeople = eatspeople;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeightinlbs() {
		return weightinlbs;
	}

	public void setWeightinlbs(int weightinlbs) {
		this.weightinlbs = weightinlbs;
	}

	public void setColor(String color) {
		this.color = color;
	}
	



}
