package week1;

public class Vehicle {
	String modelofTheVehicle = "BMW";
	char firstCharofLogo = 'b';

	public void applyBreak (){
		System.out.println("BreakApplied");
	}

	public int getNumberofWheels() {
		return 4;
	}

	public boolean isPunchered() {
		return false;	
	}


	public static void main(String[] args)
	{
		Vehicle vh = new Vehicle();
		vh.applyBreak();
		int  numberofWheels=vh.getNumberofWheels();
		System.out.println(numberofWheels);
		boolean punchered=vh.isPunchered();
		System.out.println(punchered);
		

	}

}

