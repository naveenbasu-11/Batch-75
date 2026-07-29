package ternaryOperators;
import java.util.Scanner;
public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		String result=(num%2==0)?"even":"odd";
		System.out.println("the given number is:"+result);
	}

}
