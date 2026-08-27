package twoDArrays;

import java.util.Scanner;

public class revSumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a row size:");
		int row =sc.nextInt();
		System.out.println("enter a column size:");
		int column=sc.nextInt();
		int[][]arr=new int[row][column];
		
		System.out.println("enter a elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<row;i+=2) {
			int start=0;
			int end=column-1;
			while(start<end) {
				int temp=arr[i][start];
				arr[i][start]=arr[i][end];
				arr[i][end]=temp;
				
				start++;
				end--;
			}
		}
		int middleRow=1;
		int middleCol=column/2;
		
		if(middleRow<row) {
			for(int j=0;j<column;j++) {
				if(j!=middleCol) {
					arr[middleRow][j]=arr[middleRow][j]*2;
				}
			}
			for(int i=0;i<row && i<column;i++) {
				arr[i][i]=arr[i][i]*arr[i][i];
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(  );
		}
	}

}
