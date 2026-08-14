package forLoops;

import java.util.Scanner;

public class largestDigit {
	
	static void largestDigit(int n) {
		int largest=0;
		while(n>0) {
			int digit=n%10;
			
			if(digit>largest) {
				largest=digit;
			}
			n=n/10;
		}
		System.out.println(largest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		largestDigit(num);
	}

}
