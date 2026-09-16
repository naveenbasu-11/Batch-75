package polymorphism;

import java.util.Scanner;

  class Student{
	  void calculateGrade() {
		  System.out.println("---grade marks---");
	  }
  }
  
  class EngineeringStudent extends Student{
	  
	  void calculateGrade() {
		  
		  System.out.println("-----Engineering Student marks------");
		  System.out.println("Enter marks:");
		  Scanner sc=new Scanner(System.in);
		  int marks=sc.nextInt();
		  
		  if(marks>90 && marks<100) {
			  System.out.println("Grade A");
		  }else if(marks>80 && marks<90) {
			  System.out.println("Grade B");
		  }else if(marks>70 && marks<80) {
			  System.out.println("Garde C");
		  }else if(marks>60 && marks<70) {
			  System.out.println("grade D");
		  }else if(marks>45 && marks<60) {
			  System.out.println("pass");
		  }else{
			  System.out.println("fail");
		  }
	  }
  }
  class MedicalStudent extends Student{
 void calculateGrade() {
	 Scanner sc=new Scanner(System.in);
	  int marks=sc.nextInt();
	  System.out.println("Enter the marks:"+marks);
	 if(marks>90 && marks<100) {
		  System.out.println("Grade A++");
	  }else if(marks>80 && marks<90) {
		  System.out.println("Grade A");
	  }else if(marks>70 && marks<80) {
		  System.out.println("Garde B");
	  }else if(marks>60 && marks<70) {
		  System.out.println("grade C");
	  }else if(marks>45 && marks<60) {
		  System.out.println("pass");
	  }else{
		  System.out.println("fail");
	  }
	  }
  }
  
  class ManagementStudent extends Student{
 void calculateGrade() {
		  
	  }
  }

public class overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new EngineeringStudent();
		s.calculateGrade();
	}

}
