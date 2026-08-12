package forLoops;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many values do you print");
		int n=sc.nextInt();
		fibonaciseries(n);
		
	}
	static void fibonaciseries(int n) {
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2+" ");
		int n3=0;
		
		for(int i=0;i<=n;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
}
