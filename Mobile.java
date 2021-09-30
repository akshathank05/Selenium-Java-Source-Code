package Week1Day2;

public class Mobile {
	String mobileModel = "Apple";
	int mobileWeight = 2;
	boolean isFullCharge = true ;
	double mobileCost = 1200d;
	
	public void makeCall() {
		System.out.println("Make a call ");
	}
	
	public void sendMsg() {
		System.out.println("Sending the message");
	}

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		mobile.makeCall();
		mobile.sendMsg();
		
		System.out.println("The model name is: " + mobile.mobileModel);
		System.out.println("The mobile weight is: " + mobile.mobileWeight + "kgs");
		System.out.println("The phone is fully charged: " + mobile.isFullCharge);
		System.out.println("The cost of the phone is: " + mobile.mobileCost + "$");

	}

}
