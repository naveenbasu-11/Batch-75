package twoDArrays;

import java.util.Scanner;

public class sumOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of rows:");
		int rows=sc.nextInt();
		System.out.println("enter number of columns:");
		int columns=sc.nextInt();

		int[][] arr=new int[rows][columns];
		
		int sum=0;
		System.out.println("enter a matrix numbers:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arr[i][j]+" ");
				sum=sum+arr[i][j];
			}
			System.out.println();
		}
		System.out.println("total sum of matrix:"+sum);
	}

}
