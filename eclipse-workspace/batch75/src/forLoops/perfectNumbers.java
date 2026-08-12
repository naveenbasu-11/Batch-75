package forLoops;

import java.util.Scanner;

public class perfectNumbers {

	static int sum=0;
	static void perfect(int n) {
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number of range:");
		int n=sc.nextInt();
		perfect(n);
	}

}
