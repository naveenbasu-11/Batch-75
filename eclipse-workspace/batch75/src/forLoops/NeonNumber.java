package forLoops;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int square=n*n;
		int sum=0;
		
		int tem=square;
		
		while(tem>0) {
			int digit=tem%10;
			sum=sum+digit;
			tem=tem/10;
			
			
		}
		if(sum==n ) {
			System.out.println("given number is neon");
		}else {
			System.out.println("not neon number");
		}
		
	}

}
