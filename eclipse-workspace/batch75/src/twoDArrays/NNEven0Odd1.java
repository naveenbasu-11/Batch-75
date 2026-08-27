package twoDArrays;

import java.util.Scanner;

public class NNEven0Odd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a rows:");
		int rows=sc.nextInt();
		System.out.println("enter columns:");
		int columns=sc.nextInt();
		int[][] arr=new int[rows][columns];
		 for(int i=0;i<rows;i++) {
			 for(int j=0;j<arr[i].length;j++) {
				 arr[i][j]=sc.nextInt();
			 }
		 }
		 for(int i=0;i<rows;i++) {
			 for(int j=0;j<columns;j++) {
				 if(arr[i][j]%2==0) {
					 arr[i][j]=0;
				 }else {
					 arr[i][j]=-1;
				 }
				 System.out.print(arr[i][j]+"\t");
			 }
			 System.out.println();
		 }
	}

}
