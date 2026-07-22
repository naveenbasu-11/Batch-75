package batch75;
import java.util.Scanner;
public class loanInntrest {
	
	static double calculateIntrest(double principle,double rate,int time) {
		double intrest=(principle*rate*time)/100;
		return intrest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loanInntrest loan=new loanInntrest();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter principle amount:");
		double principle=sc.nextDouble();
		
		System.out.println("enter rate of intrest:");
		double rate=sc.nextDouble();
		
		System.out.println("enter time(years):");
		int  time=sc.nextInt();
		
		
		double simpleIntrest=calculateIntrest(principle,rate,time);
		
		System.out.println("simple intrest:"+simpleIntrest);
	}

}
