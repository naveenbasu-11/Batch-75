package batch75;

public class mobileRecharge {

	String planName="unlimited 299";
	String validity="28 days";
	Float data=1.5f;
	String calls="Unlimited";
	
	void showPlanDetails() {
		System.out.println("current recharge plan");
		System.out.println("---------------------------");
		System.out.println("plan Name:"+planName);
		System.out.println("recharge validity:"+validity);
		System.out.println("daily data:"+data);
		System.out.println("calls:"+calls);
	}
	
	void recharge(double amount) {
		System.out.println("----------------------------");
		System.out.println("recharge successful!..");
		System.out.println("recharge amount:"+amount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobileRecharge n=new mobileRecharge();
		n.showPlanDetails();
		n.recharge(299.0);
		
	}
	

}

