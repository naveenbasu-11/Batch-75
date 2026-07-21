package batch75;

public class BankAccount {
	
	void displayAccount() {
		int accountNumber=9390;
		String Name="naveen";
		String Accounttype="main Account";
		int AccountBalance=9000;
		System.out.println("Account number:"+accountNumber);
		System.out.println("Account holderName:"+Name);
		System.out.println("Account type:"+Accounttype);
		System.out.println("Account Balance:"+AccountBalance);
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount obj=new BankAccount();
		obj.displayAccount();
		
		
	}

}
