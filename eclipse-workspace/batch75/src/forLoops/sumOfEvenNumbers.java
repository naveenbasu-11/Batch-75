package forLoops;

import java.util.Scanner;

public class sumOfEvenNumbers {
	
	static void sumEven(int n) {
		int sum=0;
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a n number:");
		int n=sc.nextInt();
		sumEven(n);
	}

}
