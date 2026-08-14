package forLoops;

import java.util.Scanner;

public class magicNumber {

	static void checkNumber(int n) {
		int digit = 0;

		int temp = n;

		while (n >= 10) {
			int sum = 0;
			while (n > 0) {
				digit = n % 10;
				sum = sum + digit;
				n = n / 10;

			}

			n = sum;
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		checkNumber(n);
	}

}
