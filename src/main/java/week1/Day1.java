package week1;

public class Day1 {
	
	int numberofTyre1 =2;
	
	public void vehicleType(int numberofTyre)
	{
	
	
	if (numberofTyre == 2)
	{
		System.out.println("Two Wheeler");
	}
	else if (numberofTyre == 4)
	{
		System.out.println("Four Wheeler");
	}
	else 
	{
		System.out.println("Not available");
	}
	
	
	
	
	
	switch (numberofTyre1)
	{
	case  2 : System.out.println("Two Wheeler");
	break;
	}
	
	}
	
	
	
	
	
	
/*	switch(numberofTyre) {
	
	case 2 : System.out.println("Two Wheeler");
	Break;
	
	}
*/
public static void main(String[] args) {
	
	
	
	Day1 vh=new Day1();
	vh.vehicleType(3);
			
	
	int j=0;
	for(int i=1;i<=10;i++)
	{
		j=j+i;
		
	}
	System.out.println(j);
}

}
