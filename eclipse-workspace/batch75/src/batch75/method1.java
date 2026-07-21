package batch75;

public class method1 {

	double balance=20000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1 bal=new method1();
		bal.checkBalance();
		bal.deposite(15000);
		bal.withdraw(40000);
	}
	void checkBalance() {
		System.out.println("balance method is called");
		System.out.println(balance);
	}
	void deposite(double amount) {
		System.out.println("deposite method called:"+amount);
		balance=balance+amount;
		checkBalance();
	}
	void withdraw(int draw) {
		System.out.println("withdraw successfull:"+draw);
		balance=balance-draw;
		checkBalance();
	}
}
