package batch75;

public class Bank {
	static String Bank="SBI";
	static String IFSCCode="SBIN00101";
	String AccountHolder;
	static int AccountNumber=10000200;
	
	int balance=1000;
	{
		++AccountNumber;
	}
	void display() {
		System.out.println("Bank Name:"+Bank);
		System.out.println("IFSC code:"+IFSCCode);
		System.out.println("Account Holder:"+AccountHolder);
		System.out.println("Account Balance:"+balance);
		System.out.println("Account Number:"+AccountNumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		b1.AccountHolder="naveen";
		b1.display();
		System.out.println("----------------------------");
		
		Bank b2=new Bank();
		b1.AccountHolder="Saketh";
		b1.display();
		System.out.println("-------------------------------");
		
		Bank b3=new Bank();
		b3.AccountHolder="Bunny";
		b3.display();
	}
		
}
