import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		//int number =37,
		int originalNumber, remainder, sum = 0;
		Scanner scanNumber = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanNumber.nextInt();
        originalNumber = number;
        //System.out.println(originalNumber);

        while (number > 0)
        {
        	remainder = number % 10;
            sum = sum + (remainder * remainder * remainder);
            number = number / 10;
        }
        scanNumber.close();

        if(originalNumber == sum)
            System.out.println(originalNumber + " is an Armstrong number.");
        else
            System.out.println(originalNumber + " is not an Armstrong number.");
    }

	

}
