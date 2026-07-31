package controlStatemets;
import java.util.Scanner;
public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character:");
		char ch=sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch+":is vowel");
		}else if (ch>='a' && ch<='z') {
			System.out.println(ch+":is constant");
		}else{
			System.out.println("invalid input.please enter a alphabet");
		}
	}

}
