package twoDArrays;

import java.util.Scanner;

public class leaderElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size:");
		int n=sc.nextInt();
		
		System.out.println("enter a elements:");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int leader=0;
		
		for(int i=0;i<arr.length;i++) {
			boolean status=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<=arr[j]) {
					status=false;
					break;
				}
			}
			if(status) {
				leader=arr[i];
				System.out.print(leader+" ");
			}
		}
	}
	}


