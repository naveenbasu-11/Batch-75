package nestedTernary;
import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a marks:");
		int marks=sc.nextInt();
		String grade=(marks>=90)?"A":(marks>=75)?"B":(marks>60)?"C":(marks>=35)?"D":"Fail";
		System.out.println("Grade:"+grade);
	}

}
