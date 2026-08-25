package twoDArrays;

import java.util.Scanner;

public class threeDinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
		int n=sc.nextInt();
		System.out.println("enter a column:");
		int column=sc.nextInt();
		System.out.println("enter a row:");
		int row=sc.nextInt();
		
		int[]num=new int[n];
		int[][]arr=new int[column][row];
		
		for(int i=0;i<arr.length;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			arr[row][column]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;i<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
	}

}
