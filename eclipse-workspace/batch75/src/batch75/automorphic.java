package batch75;

import java.util.Scanner;

public class automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int count=0;
		int squ=n*n;
		
		for(int i=n;i>0;i=i/10) {
			count++;
		}
		
		int last=squ%(int)Math.pow(10, count);
		if(n==last) {
			System.out.println("it is automorphic number");
		}else {
			System.out.println("not a automorphic number");
		}
	}

}
