package Week1Day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,7,6,8,0,10,12};
		int length = data.length;
		int temp = 0;
		
		for (int i=0 ; i< length; i++) {
			for( int j = i+1; j<length; j++) {
				if(data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
				
			}
			//System.out.println(data[i]);
			
			
		}
		
		for( int i = 0; i<length -1 ; i++) {
			if(( data[i+1] - data[i]) >  1) {
				
				System.out.println("Missing element in the given array is : " + ( data[i+1] - 1));
			}
			
		}
		
	}
	
	

}
