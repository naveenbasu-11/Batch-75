package forLoops;

import java.util.Scanner;

public class multiplicationTable {
	
	void table(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+(n*i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		multiplicationTable m=new multiplicationTable();
		m.table(n);
	}

}
