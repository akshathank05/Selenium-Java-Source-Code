package Week1Day2;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,12,11,4,6,27};
		int length = data.length;
		int temp = 0;
		
		for (int i=0 ; i< data.length; i++) {
			for( int j = i+1; j<data.length; j++) {
				if(data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
				
			}
			//System.out.println(data[i]);
		}
		System.out.println("Second Largest number in the given array is : " + data[length -2]);
		
	}

}
