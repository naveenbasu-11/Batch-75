package forLoops;

import java.util.Scanner;

public class reverseNumber {
	
	static void reverse(int n) {
		int orginal=n;
		int rev=0;
		while(n>0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(orginal==rev) {
			System.out.println("given number is palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		reverse(n);
	}

}
