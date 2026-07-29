package nestedTernary;
import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a age:");
		int age=sc.nextInt();
		String result=(age<=13)?"child":(age<=20)?"teenager":"adult";
		System.out.println("given age:"+result);
	}

}
