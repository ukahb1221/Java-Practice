
public class ArrayPractice {

	public static void main(String[] args) {
		char [] chars = createArray();
		
		//Display the array
		System.out.println("The lowercase letters are:");
		displayArray(chars);
		
		//Count the occurrences of each letter 
		int [] counts = countLetters(chars);
		System.out.println("The occurnces of each letter are:");
		displayCounts(counts);
	}
	
	/*Create an array of characters*/
	public static char [] createArray(){
		char [] chars = new char[100];
		
		//Create lowercase letters randomly and assign
		//them the the array
		for (int i = 0; i < chars.length; i++)
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		
		return chars;
	}

}
