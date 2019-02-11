package week1.Homework;

public class NameCapital {

	public static void main(String[] args) {
		String name = new String ("Fazil Mohammed Raffy");
		//String upperCase = name.toUpperCase();
		char[] charArray = name.toCharArray();
		
		for(int i=0;i < name.length();i=i+2) {
			
				/*System.out.print(charArray[i]);
				String string = charArray.toString();
				string.toUpperCase();
				System.out.println(string);
				*/
				charArray[i] = Character.toUpperCase(charArray[i]);
				System.out.println(charArray[i]);
			
		}

	}

}
