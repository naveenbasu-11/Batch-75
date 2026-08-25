package twoDArrays;

import java.util.Scanner;

public class sumOfDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{1,2,5,6},
				{4,5,6,9},
				{7,8,9,9},
				{5,7,2,8}};
		
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				if(i==j) {
					sum1=sum1+arr[i][j];
				}
				if(i+j==arr.length-1) {
					sum2=sum2+arr[i][j];
				}
						}
			System.out.println();
		}
		
		System.out.println("left to right:"+sum1);
		System.out.println("right to left:"+sum2);
		

	}

}
