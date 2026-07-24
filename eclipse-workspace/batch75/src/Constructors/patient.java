package Constructors;
import java.util.Scanner;
public class patient {
	
	String patientName;
	int age;
	int roomChargePerDay;
	int Admitted;
	
	patient(String name,int ages,int ChargePerDay, int DaysAdmitted){
		patientName=name;
		age=ages;
		roomChargePerDay=ChargePerDay;
		Admitted=DaysAdmitted;
		display();
	}
	void display() {
		System.out.println("patient Name:"+patientName);
		System.out.println("patient Age:"+age);
		System.out.println("Room cgarhe per Day:"+roomChargePerDay);
		System.out.println("Number of days admitted:"+Admitted);
		int total=roomChargePerDay*Admitted;
		System.out.println("Total Bill:"+total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String patientName=sc.nextLine();
		
		int age=sc.nextInt();
		
		int roomChargePerDays=sc.nextInt();
		
		int Admitted=sc.nextInt();
		int total=sc.nextInt();
		
		
	}
	

}
