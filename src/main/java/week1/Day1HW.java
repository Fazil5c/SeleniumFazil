package week1;

import java.util.Arrays;

public class Day1HW {

public void printCar(String car[])
{
	
	for(int i=0;i<car.length;i++)
	{
		
		System.out.println(car[i]);
	}

}

public static void main(String[] args) {
	String car[] = new String []{"Marudhi","Audi","BMW","Ferrari"} ;
	Day1HW obj=new Day1HW();
	Arrays.sort(car);
	obj.printCar(car);
}
}
