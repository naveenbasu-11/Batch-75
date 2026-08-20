package Arrays;

import java.util.*;

public class largestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println("enter a elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
			
		int largest=0;
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {	
				largest=arr[i];	
			}
		}
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("largest digit:"+largest);
		System.out.println("smallest digit:"+smallest);
	}

}
