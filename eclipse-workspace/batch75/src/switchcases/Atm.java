package switchcases;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		double balance=25000.00;
		
		System.out.println("-----ATM MENU-----");
		System.out.println("1.check balance");
		System.out.println("2.deposite");
		System.out.println("3.withdrawal");
		System.out.println("4.Exit");
		
		System.out.println("-------------------------");
		System.out.println("Enter your choice:");
		int choice =sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Balance:"+balance);
			break;
			
		case 2:
		System.out.println("enter deposite Amount:");
		double deposite=sc.nextDouble();
		
		balance=deposite+balance;
		
		System.out.println("amount deposited successfully");
		System.out.println("updated balance:"+balance);
		break;
		
		case 3:
			System.out.println("enter withdrawal Amount");
			double withdrawal=sc.nextDouble();
			
			if(withdrawal<=balance) {
				balance=balance-withdrawal;
				System.out.println("please collect your cash");
				System.out.println("Remaining Balance:"+balance);
			}else {
				System.out.println("insufficient balance");
			}
			break;
			
		case 4:
			System.out.println("thank you for using ATM");
			break;
			
			default:
				System.out.println("invalid choice");
		}
	

	}

}
