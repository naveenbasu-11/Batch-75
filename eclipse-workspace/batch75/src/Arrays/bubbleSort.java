package Arrays;
import java.util.*;
public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before sorting:");
		int[] arr= {4,1,6,3,8,9};
		System.out.println(Arrays.toString(arr));
		
		int temp=0;
		int count=0;
		int count1=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				count1++;
			}
			count++;
		}
		System.out.println("count:"+count);
		System.out.println("------------------------------");
		System.out.println("count:"+count1);
		System.out.println("After sorting:");
		System.out.println(Arrays.toString(arr));
	}

}
