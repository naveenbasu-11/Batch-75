package forLoops;

import java.util.Scanner;

public class reverseAlphabets {
	
	void alphabet(char ch) {
		for(char i='Z';i>=ch;i--) {
			
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter alphabet");
		char ch=sc.next().charAt(0);
		reverseAlphabets r=new reverseAlphabets();
		r.alphabet(ch);
	}

}
