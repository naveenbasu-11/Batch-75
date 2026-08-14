package forLoops;

import java.util.Scanner;

public class nthPrimeNumbers {
	
	static boolean nthPrime(int n) {
		
		while(n<2) {
			return false;
		}
		for(int i=0;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int number=2;
		if(count<n) {
			if(nthPrime(number)) {
				System.out.println(number+" ");
				count++;
			}
			number++;
		}
		
	}

}
