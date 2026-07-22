package batch75;
import java.util.Scanner;
public class StudentClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentClass stu=new StudentClass();
		
		System.out.println("Enter your Name:");
		String name=sc.nextLine();
		
		System.out.println("enter maths marks:");
		int maths=sc.nextInt();
		
		System.out.println("enter social marks:");
		int social=sc.nextInt();
		
		System.out.println("enter english marks:");
		int english=sc.nextInt();
		
		stu.displayStudent(name);
		stu.CalculateTotal(maths, social, english);
	
	}
		
		void displayStudent(String name) {
			System.out.println("Studnet Name:"+name);
		}
		void CalculateTotal(int maths,int social,int english) {
			int total=maths+social+english;
			System.out.println("total marks:"+total);
			CalculateAverage(total);
		}
		void CalculateAverage(int total) {
			double average=total/3.0;
			System.out.println("Average Marks:"+average);
		}
	}
