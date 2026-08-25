package twoDArrays;

import java.util.*;

public class interChangingrowsColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a row size:");
		int rows=sc.nextInt();
		System.out.println("enter a columns size:");
		int columns=sc.nextInt();
		
		int[][]arr=new int[rows][columns];
		System.out.println("enter a elements:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("-----original matrix-----");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-----after interchanging-----");
		for(int j=0;j<columns;j++) {
			for(int i=0;i<rows;i++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
