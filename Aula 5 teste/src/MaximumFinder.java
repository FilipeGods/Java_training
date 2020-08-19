

public class MaximumFinder{
	
	private int num1,num2,num3;
	
	//gets e sets
	public void setNumber1 (int num1) {
		
		this.num1 = num1;
		
	}
	public void setNumber2 (int num2) {
		
		this.num2 = num2;
		
	}
	public void setNumber3 (int num3) {
	
		this.num3 = num3;
	
	}
	
	public int getNumber1 () {
		
		return num1;
		
	}
	public int getNumber2 () {
		
		return num2;
		
	}
	public int getNumber3 () {
		
		return num3;
		
	}
	
	public int maximum() {
		int maximumNumber = num1;
		
		if(num2>maximumNumber)
			maximumNumber = num2;
		else
			if(num3>maximumNumber)
				maximumNumber = num3;
		
		return maximumNumber;
	}
	
	
	
}