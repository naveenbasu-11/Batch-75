package forLoops;

import java.util.Scanner;

public class factorialRecursion {
	
	static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int result=factorial(num);
		System.out.println(result);

	}

}
