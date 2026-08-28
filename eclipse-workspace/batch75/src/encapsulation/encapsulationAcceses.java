package encapsulation;

import java.util.Scanner;

public class encapsulationAcceses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee e=new employee();
		
		e.setEmpid(101);
		e.setEname("naveen");
		e.setSalary(100000);
		
		System.out.println(e.getEmpid());
		System.out.println(e.getEname());
		System.out.println(e.getSalary());
	}

}
