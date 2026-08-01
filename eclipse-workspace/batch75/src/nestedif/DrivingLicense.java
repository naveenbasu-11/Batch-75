package nestedif;
import java.util.Scanner;

public class DrivingLicense {
public static void main(String[]rags) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("-----------Driving license Applicaton----------");
	System.out.println("enter your full name:");
	String name=sc.nextLine();
	
	System.out.println("enter your father name:");
	String father=sc.nextLine();
	
	System.out.println("enter your age:");
	int age =sc.nextInt();
	sc.nextLine();	
	System.out.println("enter your education:");
	String education=sc.nextLine();
	
	System.out.println("enter your aadhar Number:");
	long aadhar=sc.nextLong();
	sc.nextLine();
	
	System.out.println("enter you pan:");
	String pan=sc.nextLine();
	
	System.out.println("two-wheeler or four-wheeler:");
	int wheeler=sc.nextInt();
	sc.nextLine();
	
	System.out.println("do you have any disability(yes/No):");
	String disability=sc.nextLine();
	
	System.out.println("do you have criminal cases(yes/No):");
	String cases=sc.nextLine();
	
	String results;
	
	if(age>18 && 
	  disability.equalsIgnoreCase("No") &&
	  cases.equalsIgnoreCase("No")) {
	
	results="your eligible";
	results="your Application is done";
}else {
	results="you are not eligible";
}
	
	System.out.println();
	System.out.println("----------YOUR APPLICATION----------");
	System.out.println("Name:"+name);
	System.out.println("Father Name:"+father);
	System.out.println("Age:"+age);
	System.out.println("Education:"+education);
	System.out.println("Aadhar Number:"+aadhar);
	System.out.println("pan Number:"+pan);
	System.out.println("Wheeler:"+wheeler);
	System.out.println("disability:"+disability);
	System.out.println("cases:"+cases);
	System.out.println("results:"+results);
}
}

