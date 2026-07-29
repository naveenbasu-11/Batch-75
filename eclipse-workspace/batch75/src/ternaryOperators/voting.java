package ternaryOperators;
import java.util.Scanner;

public class voting {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		String result=(num>=18)?"eligible":"not eligible";
		System.out.println("the given age is:"+result);
	}

}
