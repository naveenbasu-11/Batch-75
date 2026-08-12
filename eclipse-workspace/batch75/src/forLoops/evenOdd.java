package forLoops;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		// even numbers
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		//odd numbers
		System.out.println("--odd Numbers----");
		System.out.println("enter a number:");
		int m=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
