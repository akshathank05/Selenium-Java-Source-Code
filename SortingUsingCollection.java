package BasicsOfString;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] stringArray = {"Google","Microsoft","Adobe","IBM"};
		System.out.println("String array length is : "+stringArray.length);
		String temp;
		
		for (int i=0 ; i< stringArray.length; i++) {
			for( int j = i+1; j<stringArray.length; j++) {
				if(stringArray[i].compareTo(stringArray[j]) < 0) {
					temp = stringArray[i];
					stringArray[i] = stringArray[j];
					stringArray[j] = temp;
				}
				
			}
			System.out.println(stringArray[i]);
		}	

	}
}