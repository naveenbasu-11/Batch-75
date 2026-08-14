package forLoops;

import java.util.Scanner;

public class happyNumber {
	
	static void happy(int n) {
		
		while(n>10) {
		int sum=0;
		
		while(n>0) {
			int digit=n%10;
			sum=sum+digit*digit;
			n=n/10;
		}
		n=sum;
	}
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		happy(n);
	}

}
