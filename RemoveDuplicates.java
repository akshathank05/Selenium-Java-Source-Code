package Week1Day2;


import java.util.Arrays;

public class RemoveDuplicates {
	

	public static void main(String[] args) {
		
		String name = "PayPal Canada ";
		int index = 0;
		char[] actualArr = name.toCharArray();
		int length = actualArr.length;
		System.out.println("Given string to remove duplicate is : " + name);
		
		for(int i=0; i <length; i++) {
			
			int j =0;
			
			for(  j = 0; j<i; j++) {
									
				if(actualArr[i] == actualArr[j]) {
					break;
				
				}
							
			}
			if(j == i) {
				actualArr[index++]= (actualArr[i]);
			}
		}
		
		//String  str = (Arrays.toString(actualArr));
		String  str =String.valueOf(Arrays.copyOf(actualArr, index));
		
		str = str.replaceAll("\\s", "");
		System.out.println("String after removing the duplicate character : " + str);
	}

}
