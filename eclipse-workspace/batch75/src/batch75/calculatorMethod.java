package batch75;
import java.util.Scanner;

public class calculatorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//object creation
		calculatorMethod cal=new calculatorMethod();
		
		System.out.println("enter first number:");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		cal.add(a, b);
		cal.subtract(a, b);
		cal.multiply(a, b);
		cal.divide(a, b);
		
	}
	void add(int a,int b) {
		System.out.println("Addition:"+(a+b));
	}
	void subtract(int a,int b) {
		System.out.println("Subtraction:"+(a-b));
	}
	void multiply(int a,int b) {
		System.out.println("multiplication:"+(a*b));
	}
	void divide(int a,int b) {
		System.out.println("division:"+(a/b));
	}

}
