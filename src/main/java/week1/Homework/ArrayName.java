package week1.Homework;

public class ArrayName {

	public static void main(String[] args) {
		String[] arr= {"Fazil", "Shalini", "Shajitha"};
		
        for (int i = 0; i < arr.length; i++) {
        	char charAt = arr[i].charAt(0);
        	if(charAt == 'S' || charAt == 's' ) {
			System.out.println(arr[i]);
			
		}
	}

}
}